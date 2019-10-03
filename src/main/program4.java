package main;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class program4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.next().trim();
        name=name.toUpperCase();
        System.out.println(name);
    }
}
