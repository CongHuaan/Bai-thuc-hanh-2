import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bai4th_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Set<String> set = new TreeSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
            StringBuilder a = new StringBuilder();
            String word = "";
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] numbers = line.split("\\s+");
                for (String num : numbers) {
                    if (num.matches(".*\\d.*") && !num.matches(".*[.,!?:].*")) {
                        set.add(num);
                    }
                } 
            }
            for(String x : set) {
                System.out.println(x);
            }
    }
}
