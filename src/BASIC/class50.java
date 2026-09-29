package BASIC;

import java.util.Scanner;

public class class50 {
    static void main() {
        // input array & output X2
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("enter the element of array : ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print the output in double multiple form : ");


        for(int ele:arr){
            System.out.print(2*ele+" ");
        }
    }
}
