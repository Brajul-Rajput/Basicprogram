package GFG;

public class GFG1 {
    static void main() {
        int arr[]={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
