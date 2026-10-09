package GFG;

public class GFG3 {
    static void main() {
        int arr[]={3,5,1,4,2,7,5,3};
        int n= arr.length;
        for(int j=0;j<n-1;j++){
        for(int i=0;i<n-1-j;i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        }
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
