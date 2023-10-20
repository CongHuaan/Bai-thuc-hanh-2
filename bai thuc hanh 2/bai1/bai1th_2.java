
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai1th_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> a = new ArrayList<>();
        while(sc.hasNext()){
            a.add(sc.nextBigInteger());
        }
        Collections.sort(a);
        BigInteger sum = BigInteger.ZERO;
        for(BigInteger x : a) {
            sum = sum.add(x);
            
        }
        System.out.println(a.get(0));
        System.out.println(a.get(a.size()-1));
        System.out.println(sum);
    }
}
