package GFG;

public class GFG2 {
    static void main() {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,2,0,4,1,3,0};
        System.out.println( solotuion(arr));
        System.out.println(    solotuion(arr2));

    }

  public static boolean solotuion(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }

return true;
    }
}
