package main;
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String name=s.next().trim();
            int l=name.length();
            int sum=0;
            char ch;
            for(int i=0;i<1;i++){
                ch=name.charAt(i);
                sum +=(int) ch;
            }
                System.out.println(sum);
            }

    }

