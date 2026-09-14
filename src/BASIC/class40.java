package BASIC;

import java.util.Scanner;

public class class40 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int b:arr){
            System.out.print(b+" ");
        }
    }
}
