
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai5th_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(new File("E:\\bt Java\\baitap\\src\\DN.in"));
        while(sc.hasNext()) {
            String s = sc.nextLine();
            Pattern pt = Pattern.compile("\\b\\d{1,2}:\\d{2}:\\d{2,09}\\b");
            Matcher matcher = pt.matcher(s);
            while(matcher.find()) {
                String time = matcher.group();
                set.add(time);
            }
        }
        for(String x : set) {
            System.out.println(x);
        }
        
    }
}
