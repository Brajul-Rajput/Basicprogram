package BASIC;

import java.util.Scanner;

public class class21 {
    static void main() {
        //salary tax
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary up to 50000  to 100000: ");
        double sal=sc.nextDouble();
        if(sal>50000){
            System.out.println(sal*0.1);
        }
        else if(sal>70000){
            System.out.println(sal*0.2);
        }
        else{
            System.out.println(sal*0.3);
        }

    }
}
