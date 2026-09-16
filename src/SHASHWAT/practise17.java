package SHASHWAT;

public class practise17 {
    static void main() {
        int arr[]={2,4,5,7,7,7,7,10,11};
        int target=7;
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
