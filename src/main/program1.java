package main;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        System.out.print("index: ");
        int l = name.length();
        for (int i = 0; i < 1; i++) {
            System.out.println(i + "\t");
        }
        System.out.println();
        System.out.print("chars: ");
        for (int j = 0; j < 1; j++) {
            System.out.println(name.charAt(j) + "\t");
        }
    }
}
