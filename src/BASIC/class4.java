package BASIC;

import java.util.Scanner;

public class class4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit : ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
