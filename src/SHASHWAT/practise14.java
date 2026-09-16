package SHASHWAT;

import com.sun.security.jgss.GSSUtil;

public class practise14 {
    static void main() {
        int arr[]={2,3,4,5,5,5,8,9};
        int arr2[]={9,8,7,6,5,5,5,3,2};
        int arr3[]={2,2,2,2,2,2,};
        int s=arr[0];int e=arr[arr.length-1];
        if(s==e){
            System.out.println("all equals");
        }
        else if(s<e){
          //  incre(arr,5);
              incre(arr2,5);
            System.out.println("incre");

        }
        else {
           // decre(arr,5);
             decre(arr2,5);
            System.out.println("decre");

        }

    }
    public static void incre(int arr[],int target){
        int s=0;
        int ans=-1;

        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            //System.out.println(ans);
        }
        System.out.println(ans);
    }

    public static void decre(int arr[],int target){
        int s=0;
        int ans=-1;

        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
}
