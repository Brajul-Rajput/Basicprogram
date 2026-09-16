package STRIVER;

public class secondlargest {
    static void main() {
        int arr[]={28,2,13,8,5,4};
        int f=arr[0];
        int s=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }
        }
        System.out.println(f+" "+s);
    }

}
