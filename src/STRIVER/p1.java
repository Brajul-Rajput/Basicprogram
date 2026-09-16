package STRIVER;

public class p1 {
    //largest in array
    static void main() {
        int arr[]={3,2,1,5,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
