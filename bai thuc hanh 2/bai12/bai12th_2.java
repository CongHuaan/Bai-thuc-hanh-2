
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai12th_2 {
    public static long max(long a[], int n) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        long b1[] = new long[n];
        long b2[] = new long[n];
        for(int i = n - 1; i >= 0; i--) {
            while(!st1.empty() && a[i] <= a[st1.peek()]) {
                st1.pop();
            }
            if(st1.empty()) {
                b1[i] = n;
            }
            else {
                b1[i] = st1.peek();
            }
            st1.add(i);
        }
        for(int i = 0; i < n; i++) {
            while(!st2.empty() && a[i] <= a[st2.peek()]) {
                st2.pop();
            }
            if(st2.empty()) {
                b2[i] = -1;
            }
            else {
                b2[i] = st2.peek();
            }
            st2.add(i);
        }
        long res = 0;
        for(int i = 0; i < n; i++) {
            res = Math.max(res, a[i] * (b1[i] - b2[i] - 1));
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        long a[] = new long[m];
        long b[] = new long[m];
        for(int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
            b[i] = n - a[i];
        }
        System.out.println(Math.max(max(a, m), max(b, m)));
    }
}
