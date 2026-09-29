package BASIC;

public class class56 {
    static void main() {
        //shallow copy
        int arr[]={2,4,6,8,9};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        int x[]=arr;
        x[0]=100;
       for(int ele:arr){
           System.out.print(ele+" ");
       }
        System.out.println(" ");
       for(int el:x){
           System.out.print(el+" ");
       }
    }
}
