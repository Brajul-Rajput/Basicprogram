package BASIC;

import java.util.Scanner;

public class allodd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the odd digit : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i=i+2){
            System.out.print(i+" ");
        }
    }
}
