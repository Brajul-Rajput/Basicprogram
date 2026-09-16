package SHASHWAT;

public class class25 {
    // for decrisng
    static void main() {
        int arr[]={87,54,36,32,22,18,5,3,2};
        int ans=-1;
        int t=3;
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==t){
                ans=m;
                break;
            }
            else if(t<m){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        System.out.println(ans);
    }
}
