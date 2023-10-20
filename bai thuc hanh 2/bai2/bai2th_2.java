
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai2th_2 {
    
    public static boolean check(int n) {
        if(n < 10) {
            return false;
        }
        String word = n + "";
        for(int i = 0; i < word.length() - 1; i++) {
            if((word.charAt(i) - '0') > (word.charAt(i + 1) - '0')) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        int b1[] = new int[100005];
        int b2[] = new int[100005];
        for(int i : a) {
            if(check(i)) {
                b1[i]++;
            }
        }
        for(int i : b) {
            if(check(i)) {
                b2[i]++;
            }
        }
        for(int i = 10; i < 10000; i++) {
            if(b1[i] != 0 && b2[i] != 0) {
                System.out.println(i + " " + b1[i] + " " + b2[i]);
            }
        }
    }
}
