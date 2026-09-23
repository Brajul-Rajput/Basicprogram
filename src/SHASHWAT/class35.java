package SHASHWAT;

public class class35 {
    static void main() {
        int arr[] = {2, 4, 5, 1, 0};
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]<arr[i+1]){
                i++;
            }
            else{
                break;
            }
        }
        while(i<j){
            if(arr[i]>arr[i+1]){
                i++;
            }
            else{
                break;
            }
        }
        System.out.println(arr[i]==arr[j]);
    }
}
