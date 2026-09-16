package SHASHWAT;

public class class27 {
    static void main() {
        int arr[]={2,2,4,4,8,12,16};
        boolean first=false;
        int ans=-1;
        int s=0;
        int target=4;
        int e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                if(first==true){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
           // System.out.println(ans);
        }
        System.out.println(ans);
       // System.out.println("not found element ");
    }
}
