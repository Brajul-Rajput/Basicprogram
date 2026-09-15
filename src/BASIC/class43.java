package BASIC;

import java.util.Scanner;

public class class43 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int size=sc.nextInt();
        int sum=0;
        int arr[]=new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
