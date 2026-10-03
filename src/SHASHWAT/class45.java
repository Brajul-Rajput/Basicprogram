package SHASHWAT;

public class class45
{
    static void main() {
        int sum=0;
        int num=121;
        int copy=num;
        while(num>0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);

        if(sum==copy){
            System.out.println("t");
        }
        else{
        System.out.println("f");
//  System.out.println(sum==num);
        }
        }

}
