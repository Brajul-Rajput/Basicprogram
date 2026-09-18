package SHASHWAT;

public class class32 {
    static void main() {
        int arr[]={2,4,8,13,17,19,32};
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        int target=22;
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
        System.out.println("ceiling is "+arr[s]);
        System.out.println("floor is "+arr[e]);
        int res1=Math.abs(target-arr[s]);
        int res2=Math.abs(target-arr[e]);
            int re=(res1<res2)?res1:res2;
        System.out.println(re);
        }

}
