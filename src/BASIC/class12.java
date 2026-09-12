package BASIC;

import java.util.Scanner;

public class class12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        System.out.println("enter the second digit : ");
        int num2=sc.nextInt();
        if(num>num2){
            System.out.println("num1 > num2");
        }
        else{
            System.out.println("num2 > num1");
        }

    }
}
