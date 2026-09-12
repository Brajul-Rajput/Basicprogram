package BASIC;

import java.sql.SQLOutput;
import java.util.Scanner;


public class addnum {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the first digit : ");
        int num1=sc.nextInt();
        System.out.println("enter the second digit : ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum is : "+sum);
    }
}
