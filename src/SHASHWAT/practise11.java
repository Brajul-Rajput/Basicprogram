package SHASHWAT;

public class practise11 {
    //second largest
    static void main() {
        int arr[]={10,5,20,8,15};
        second(arr);

    }
    public static  void second(int arr[]){
        int first=-1;
        int sec=-1;
        for(int i=0;i< arr.length;i++) {
            if (first < arr[i]) {
                first = arr[i];
            }
            System.out.println(first);
        }
        if(first<sec){
            sec=first;
        }
        System.out.println(sec);

    }
}
