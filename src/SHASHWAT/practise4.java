package SHASHWAT;

public class practise4 {
    //search the element
    static void main() {
       int []nums={10,20,30,40,50};
        System.out.println(searching(nums,3));
    }
    public static int searching(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
