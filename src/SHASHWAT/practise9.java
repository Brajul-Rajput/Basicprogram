package SHASHWAT;

public class practise9 {
    //minmum find
    static void main() {
        int arr[]={8,3,6,9,1,4};
        minfind(arr);

    }
    public static void minfind(int arr[]){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

}
