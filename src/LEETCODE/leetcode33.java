package LEETCODE;

public class leetcode33 {
    static void main() {
int arr[]={5,6,7,1,2,3,4};
        System.out.println(search(arr,3));
    }
    public static int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
       int ans=-1;
        while(s<=e){
           int mid=(s+e)/2;
           if(nums[mid]==target){
               ans=mid;
             return  mid;
           }
           if(nums[s]<=nums[mid]){
               if(target>nums[s]&& target<=nums[mid]){
                   e=mid-1;
               }
               else{
                   s=mid+1;
               }
           }
           else{
               if(target>nums[mid]&& target<=nums[e]){
                   s=mid+1;
               }
               else{
                   e=mid-1;
               }
           }

        }


        return ans;
    }

}
