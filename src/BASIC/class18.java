package BASIC;

import java.util.Scanner;

public class class18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age : ");
        int age =sc.nextInt();
        if(age>18){
            System.out.println("right to vote for age  : "+age );
        }
        else{
            System.out.println("not applicable for vote ");
        }
    }
}
