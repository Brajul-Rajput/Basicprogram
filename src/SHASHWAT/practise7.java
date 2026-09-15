package SHASHWAT;

public class practise7 {
    //first occourance
    static void main() {
        int arr[]={4,2,7,2,9,2};
         search(arr,2);

    }
    public static void search(int arr[], int target){
        int ans=-1;
         for(int i=0;i<arr.length;i++)
            if(arr[i]==target)
             ans=i;

        System.out.println(ans);
    }

}
