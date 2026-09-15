package SHASHWAT;

public class practise10 {
    //max find
    static void main() {
        int arr[]={8,3,6,9,1,4};
        maxfind(arr);

    }
    public static void maxfind(int arr[]){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}

