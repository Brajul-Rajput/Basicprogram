package BASIC;

import java.util.Scanner;

public class class13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("enter the power is : ");
        int pow=sc.nextInt();
int rev=1;
        for(int i=1;i<=pow;i++){
             rev=num*rev;
        }
        System.out.println(rev);
    }
}
