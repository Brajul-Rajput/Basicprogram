package BASIC;

import java.util.Scanner;

public class class7 {
    static void main() {
        //sum of all odd and even
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit even number sum : ");
        int num=sc.nextInt();
        int sum=0;
        //even
        for(int i=0;i<num;i=i+2){
           sum=sum+i;
        }
        System.out.println("even " +sum);
//odd
        int re=0;
        for(int i=1;i<num;i=i+2){
            re=re+i;
        }
        System.out.println("odd " +re);

    }
}
