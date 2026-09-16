package SHASHWAT;

public class practise18 {
    static void main() {
      int arr[]={2,3,4,7,7,7,7,8,9};
      fisrt(arr,7);
      last(arr,7);
    }
    public static void fisrt(int arr[],int target){

    boolean fist=true;
    int s=0;
    int ans=-1;
    int e=arr.length-1;
        while(s<=e){
        int mid=(s+e)/2;
        if(arr[mid]==target){
            ans=mid;
            if(fist){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        else if(arr[mid]<target){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }
        System.out.println(ans);
}
public static void last(int arr[],int target){
    boolean fist=false;
    int s=0;
    int ans=-1;
    int e=arr.length-1;
    while(s<=e){
        int mid=(s+e)/2;
        if(arr[mid]==target){
            ans=mid;
            if(fist){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        else if(arr[mid]<target){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }
    System.out.println(ans);

}

}
