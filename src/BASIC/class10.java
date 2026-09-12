package BASIC;

import java.util.Scanner;

public class class10 {
    static void main() {
        //print ascii value
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the charcter : ");
        char ch=sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
