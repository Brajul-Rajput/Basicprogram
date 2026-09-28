package BASIC;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class class49 {
    static void main() {
        //two sum
     /*   int arr[]={1,5,8,-3};
        int tar=2;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[i]+arr[arr.length-1]==tar){
                System.out.println(i+" "+n);
            }
            }
           */

        //int arr[]={0,0,1,0,1,1,0,1,0};
      /*  int arr[]={1,2,3,4,5,6};
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
           // if(arr[i]!=arr[n-1]){
           //     int tem=arr[i];
           //     arr[i]=arr[n-1];
           //     arr[n-1]=tem;
          //}
         //   System.out.print(arr[i]+" ");
            System.out.print(arr[i]+" ");
        }
       */
        int arr[]={1,2,3,4,5};
        int i=arr[0];
        int temp=arr[0];
        int j= arr.length-1;
    while (i<j){
        if(arr[i]<arr[i+1]){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
        System.out.print(arr[i]+" ");
    }
    }
    }

