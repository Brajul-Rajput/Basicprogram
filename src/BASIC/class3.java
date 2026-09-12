package BASIC;

import java.util.Scanner;

public class class3 {
    static void main() {
        //natural number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
