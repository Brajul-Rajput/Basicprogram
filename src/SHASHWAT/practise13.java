package SHASHWAT;

public class practise13 {
    static void main() {
        int arr[]={22,20,18,11,10,2,1};
        int s=0;
        int ans=-1;
        int target=2;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
    }

