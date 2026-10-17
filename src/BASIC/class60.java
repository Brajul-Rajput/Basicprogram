package BASIC;

public class class60 {
    static void main() {
        int arr[]={2,4,7,8,11,12,17,18,20};
        int blocksize=(int)Math.sqrt(arr.length);
       // System.out.println(blocksize);
        int target=1;
        int start = arr[0];
        int end = blocksize;
boolean found=false;
        for(int i=0;i< arr.length-1;i++) {

            if(arr[end]<=target){
                start=end;
                end=end+blocksize;
found=true;
        break;
            }
        }
        for(int j=start;j<=end;j++){
            if(arr[j]==target){
                System.out.println(j);
            }
        }
        if(!found){
            System.out.println("not present");
        }
    }
}
