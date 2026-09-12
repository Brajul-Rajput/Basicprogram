package BASIC;

import java.util.Scanner;

public class class15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks 5 subject : ");
        int arr[]=new int[5];
        for(int i=0;i< arr.length;i++){
             arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/arr.length);

    }
}
