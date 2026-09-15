package SHASHWAT;

public class practise8 {
    //count occources
    static void main() {
        int arr[]={2,5,2,8,2,9,2};
        countsearch(arr,2);
    }
    public static void countsearch(int arr[],int target){
        int size= arr.length;
        int res[]=new int[size];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                res[0]=arr[i];
                j++;

                System.out.println(res[j]);
            }
           // System.out.print(res[4]);
        }


    }
}
