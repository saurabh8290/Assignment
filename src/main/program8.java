package main;
import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch;
        int sum = 0;
        int l = name.length();
        for (int i = 0; i < 1; i++) {
            ch = name.charAt(i);
            if (ch >= 65 && ch <= 91) {
                sum += (int) ch;
            }
        }
        System.out.println(sum);
    }
}