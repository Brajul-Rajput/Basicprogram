package STRIVER;

public class largestelement {
    static void main() {
       int arr[]={3,2,1,5,2};
       largest(arr);
    }
    public static void largest(int arr[]){
        int larg=arr[0];
        for(int i=0;i<arr.length;i++){
            if(larg<arr[i]){
                larg=arr[i];
            }
        }
        System.out.println(larg);
    }
}
