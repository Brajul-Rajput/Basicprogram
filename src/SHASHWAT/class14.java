package SHASHWAT;

public class class14 {
    static void main() {
      class14 dn=new class14();
      dn.digitcount(32104);
    }
    public void digitcount(int num ){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
