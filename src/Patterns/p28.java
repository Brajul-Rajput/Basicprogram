package Patterns;

import java.lang.reflect.Array;

public class p28 {
    static void main() {
        int arr1[]={1,3,5};
        int arr2[]={1,2,4};
        for(int i=0;i< arr1.length-1;i++){
            int a1=arr1[i];
            int a2=arr1[i+1];
            int d=a1-a2;
            System.out.print(d+" ");
        }
      //  System.out.println(Array.reverse(arr1));
    }
}
