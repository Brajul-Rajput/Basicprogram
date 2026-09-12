package SHASHWAT;

import java.util.Scanner;

public class class1 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your name : ");
        String name=sc.nextLine();
        System.out.println("hi "+name);
        System.out.println("enter the age : ");
        String age=sc.next();
        int myage=Integer.parseInt(age);
        System.out.println("your age is "+myage);

    }
}
