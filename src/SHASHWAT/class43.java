package SHASHWAT;

public class class43 {
    static void main() {
        int arr[]={3,1,3,3,4,7,2,8,4,9,};
        int target=3;
        int ans[]=new int[arr.length];
        int k=0;
        for(int i=0;i< arr.length;i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
            for(int j=0;j<k;j++){
                System.out.print(ans[j]+" ");
            }

       // System.out.println(ans);
    }
}
