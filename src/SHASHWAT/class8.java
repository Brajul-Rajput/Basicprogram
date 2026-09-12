package SHASHWAT;

public class class8 {
    static void main() {
        int num=1234;
        int first=8;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        int ans=first*(int)Math.pow(10,count);
        int f=ans+num;
        System.out.println(f);
    }
}
