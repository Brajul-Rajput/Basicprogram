package SHASHWAT;

public class practise15 {
    //not found element
    static void main() {
        int arr[]={2,4,5,7,9,10,11};
        int target=13;
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
        }
        System.out.println(ans);
    }

}
