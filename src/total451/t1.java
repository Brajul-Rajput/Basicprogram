package total451;

public class t1 {
    static void main() {
       int arr[]={1,3,5,5,5,5,67,121,123};
        System.out.println(first(arr,5,true));
        System.out.println(first(arr,5,false));

    }
    public static int first(int arr[],int target,boolean fstlst){
        int s=0;
        int e= arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                if(fstlst){
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
        return ans;
    }
}
