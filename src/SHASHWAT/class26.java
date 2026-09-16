package SHASHWAT;

public class class26 {
    static void main() {
        int arr[]={2,5,8,12,16,23,38};
        int target=16;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
