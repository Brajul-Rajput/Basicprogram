package SHASHWAT;

public class class17 {
    static void main() {
       class17 scn=new class17();
       scn.reverse(3429);
    }
    public  void reverse(int num ){
        int sum=0;
        while(num>0){
            int unit=num%10;
            sum=sum*10+unit;
            num/=10;
        }
        System.out.println(sum);
    }
}
