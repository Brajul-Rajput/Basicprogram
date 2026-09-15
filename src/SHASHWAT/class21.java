package SHASHWAT;

public class class21 {
    static void main() {
        int arr[]={2,3,7,1,9,5,4};
      // linearsearch(arr,9);
        int rr[]={2,2,3,5,1,7,3,9};
        //  linar2(rr,3);
        linearsearch(rr,3);
        linar3(rr,3);

    }
    public static void linearsearch(int arr[],int target){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                break;
            }

        }
        System.out.println(ans);
    }
    public static void linar2(int rr[],int tt){
        for(int i=0;i<rr.length;i++){
            if(rr[i]==tt){
                System.out.print("present "+i+" ");
                break;
            }
            System.out.print(" not "+i);
        }
    }


    public static void linar3(int rr[],int tt){
        int res=-1;
        for(int i=0;i<rr.length;i++){
            if(rr[i]==tt)
              res=i;

        }
        System.out.print(res);
    }
}
