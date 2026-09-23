package SHASHWAT;

public class class37 {
    static void main() {
        int arr[]={4,5,6,7,0,1,2};
        int s=0;
        int target=0;
        int ans=-1;
        int e= arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
              //  System.out.println(mid);
                ans=mid;
                
              //  break;
            }
            else if(arr[s]<=arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
