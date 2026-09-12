package BASIC;

import java.util.Scanner;

public class class6 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numner : ");
        int num=sc.nextInt();
        for(int i=0;i<num;i=i+2){
            System.out.print(i+" ");
        }

    }
}
