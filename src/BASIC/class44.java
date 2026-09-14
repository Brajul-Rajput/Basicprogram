package BASIC;

import java.util.Scanner;

public class class44 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("select one element in array : ");
        int target=sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if(target==arr[i]){
                System.out.println("postion is "+i);
            }
            else{
                System.out.println("not element in array ");
            }
        }
    }
}
