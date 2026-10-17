package BASIC;

public class class62 {
    static void main() {
        int arr[]={10,1,7,0,8,2,11};
        for(int i=0;i< arr.length-1;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]>=arr[j]){
                    arr[i]=arr[i+1];
                    arr[j]=arr[i];

                }

            }
            for(int b:arr){
                System.out.print(b+" ");
            }
        }
    }
}
