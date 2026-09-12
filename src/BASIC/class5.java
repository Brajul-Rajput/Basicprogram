package BASIC;

import java.util.Scanner;

public class class5 {
    static void main() {
        //all odd number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        for(int i=1;i<num;i=i+2){
            System.out.print(i+" ");
        }
    }
}
