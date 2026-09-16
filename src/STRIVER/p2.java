package STRIVER;

public class p2 {
    //second largest
    static void main() {
        int arr[]={35,40, 30,12,50,38,41};
        int first=arr[0];
        int second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(first+" "+second);
    }
}
