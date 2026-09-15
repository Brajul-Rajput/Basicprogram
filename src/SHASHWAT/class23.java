package SHASHWAT;

public class class23 {
    static void main() {
    //find
        int arr[]={2,7,1,6,9,11,3,5,22, 4,2 };
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

}
