package SHASHWAT;

public class class31 {
    static void main() {
        int arr[]={9,5,1,4,6,1};
        int temp=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
                arr[i]=temp;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
