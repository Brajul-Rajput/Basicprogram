package SHASHWAT;

public class practise5 {
    //element present or not
    static void main() {
        int arr[]={5,8,2,9,1};
        System.out.println(search(arr,7));
    }
    public static boolean search(int arr[],int target) {
boolean ispresent=false;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
       return true;

    }
}
return ispresent;
    }
}
