package BASIC;

import java.util.Scanner;

public class naturalnum {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the digit of natral number  : ");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
