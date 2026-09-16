package STRIVER;

public class p3 {
    //sortrd array or not
    static void main() {
        int arr[]={3,4,1,5,3,2};
        System.out.println(   soet(arr));

    }
    public static boolean soet(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
            }
            else{
                return false;
            }
        }
        return true;
    }
}
