package BASIC;

import java.util.Scanner;

public class class55 {
    static void main() {
        //minimum element in array :
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("enter the element in an array : ");
        int arr[]=new int[size];
       // int min=arr[0];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int min=arr[0];
        System.out.println("The min element is in these arraay : ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}


