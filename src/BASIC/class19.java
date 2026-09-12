package BASIC;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class19 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
