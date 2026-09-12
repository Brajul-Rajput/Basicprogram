package BASIC;

import java.util.Scanner;

public class class16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial : ");
        int num=sc.nextInt();
        int mul=1;
        for(int i=1;i<=num;i++){
            mul=mul*i;

        }
        System.out.println(mul);
    }
}
