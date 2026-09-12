package BASIC;

import java.util.Scanner;

public class class1 {
    static void main() {
        //odd even
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }


    }
}
