package SHASHWAT;

public class class22 {
    static void main() {
        //find max
        int arr[]={2,7,1,6,9,11,3,5,22,0, 4,2 };
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
