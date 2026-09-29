package BASIC;

import java.util.Scanner;

public class class57 {
    static void main() {
        //odd index multiple by 2 & even index +10
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("enter the array elemnet : ");
        int arr[]=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("odd index multiple by 2 & even index +10");
        for(int i=0;i<arr.length;i++){
            if(i%2==0) System.out.print(arr[i]+10+" ");
            else System.out.print(arr[i]*2+" ");
        }
    }
}
