package BASIC;

import java.util.Scanner;

public class class54 {
    static void main() {
        //maximum element in array :
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("enter the element in an array : ");
        int arr[]=new int[size];
     //   int max=arr[0];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        System.out.println("The max element is in these arraay : ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
