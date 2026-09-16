package SHASHWAT;

public class practise12 {
    //search the element
    static void main() {
        int arr[]={2,5,8,12,16,23,26};
        int s=0;
        int ans=-1;
        int target=16;
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
}
