package BASIC;

import java.util.Scanner;

public class class14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first : ");
        int a=sc.nextInt();
        System.out.println("enter second  : ");
        int b=sc.nextInt();
        System.out.println("enter thirsd : ");
        int c=sc.nextInt();
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }

}
