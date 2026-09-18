package SHASHWAT;

public class class29 {
    static void main() {

        int arr[]={2,2,2,2,3,4,5,6,8,8,10,11,14,16,19,99};
        int target=12;
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                s=mid+1;
               // ans=arr[mid];
            }
            else{
                e=mid-1;
                ans=arr[mid];

            }
        }
        System.out.println(ans);
    }
}
