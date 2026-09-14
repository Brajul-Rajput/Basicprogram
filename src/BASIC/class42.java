package BASIC;

import java.util.Scanner;

public class class42 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size= sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int brr[]=new int[size];
        for(int i=0;i<= arr.length;i++){
            brr[i]=arr[i];
            System.out.print(brr[i]+" ");
        }


    }
}
