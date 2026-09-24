package SHASHWAT;

public class class40 {
    static void main() {
        int arr[]={3,1,3,3,4,7,2,8,4,9,};
        int target=7;
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                ans =i;
                break;
            }
        }
        System.out.println(ans);
    }
}
