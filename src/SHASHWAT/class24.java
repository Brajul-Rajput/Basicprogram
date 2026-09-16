package SHASHWAT;

public class class24 {
    static void main() {
        int arr[]={2,4,11,20,37};
        int tar=20;
        int start=0;
        int ans=-1;
        int end= arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == tar) {
                ans = mid;
                break;
            } else if (arr[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
           if(ans==-1){
               System.out.println("not elenet");
           }
           else{
               System.out.println(ans);
           }


    }
}
