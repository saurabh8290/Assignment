package main;
import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        char ch=s.nextLine().charAt(0);
        int l=name.length();
        System.out.println("output: ");
        for(int i=0;i<1;i++){
            char ch1=name.charAt(i);
            if (ch1==ch){
                System.out.println(i);
            }
        }

        }
}

