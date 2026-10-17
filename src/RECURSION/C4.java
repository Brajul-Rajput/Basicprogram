package RECURSION;

public class C4 {
    static void main() {
        int arr[]={7,6,1,4,5,8,0,2};
        System.out.println( printtt(0,arr,6));

    }
    public static boolean printtt(int i,int arr[],int target){
        if(i==arr.length)return false;
        if(arr[i]==target)return true;
     return    printtt(i+1,arr,target);

    }

}
