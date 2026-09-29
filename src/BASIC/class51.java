package BASIC;

import java.util.Scanner;

public class class51 {
    static void main() {
        //given an array pritn negative no only :
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size=sc.nextInt();
        System.out.println("enter the array element with negative no : ");
        int arr[]=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print the negative number only :");
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
