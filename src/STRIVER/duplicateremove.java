package STRIVER;

public class duplicateremove {
    static void main() {
        int arr[]={1,1,2,2,3,3,4};
        for(int i=0;i< arr.length;i++){
            for(int j=1;j<i-1;j++){
                if(arr[i]!=arr[j])
                    System.out.println(arr[i]);
            }

        }
    }
}
