package RECURSION;

public class C3 {
    static void main() {
        int arr[]={7,6,1,4,5,8,0,2};
       printarr(0,arr);
    }
    public static void printarr(int i,int arr[]){
        if(i==arr.length)return;
        printarr(i+1,arr);
        System.out.print(arr[i]+" ");
    }
}
