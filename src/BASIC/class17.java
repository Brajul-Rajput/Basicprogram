package BASIC;

import java.util.Scanner;

public class class17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;

        }
        System.out.println(count);
    }
}
