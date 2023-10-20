
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai11th_2 {
    public static String reverse(String s) {
        StringBuilder tmp = new StringBuilder(s);
        String res = tmp.reverse().toString();
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        ArrayList<String> a = new ArrayList<>();
        q.add("0");
        q.add("1");
        while(true) {
            String tmp = q.peek();
            q.remove();
            if(tmp.length() > 15) break;
            String temp = reverse(tmp);
            a.add(tmp + temp);
            q.add(tmp + "0");
            q.add(tmp + "1");
        }
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for(String x : a) {
                if(x.length() <= n) {
                    System.out.print(x + " ");
                }
                else break;
            }
            System.out.println("");
        }
    }
}
