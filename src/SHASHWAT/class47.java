package SHASHWAT;

public class class47 {
    static void main() {
        int arr[]={2,3,5,7,11,12,16,19,24,30};
        int target=12;
int n= arr.length;
int blocksize= (int)Math.sqrt(n);
int s=arr[0];
int end=blocksize;
if(end<=target){
    s=end;
    end=end+blocksize;
}
for(int i=s;i<end;i++){
    if(i==target){
        System.out.println(i);
    }
}

        }
    }

