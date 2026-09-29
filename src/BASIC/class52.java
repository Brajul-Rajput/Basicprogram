package BASIC;

import java.util.Scanner;

public class class52 {
    static void main() {
        // sum the array element  :
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int size =sc.nextInt();
        System.out.println("enter the element of anarray : ");

        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of all the number is  "+sum);
    }
}
