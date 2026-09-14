package SHASHWAT;

import static java.lang.Math.log10;

public class class13 {
    static void main() {
class13 db=new class13();
db.digitcount(0);
    }
    public void digitcount(int num ){
        if(num==0){
            System.out.println(1);
            return;
        }
        boolean mynum=false;
        if(mynum){
            num=-1*num;
        }
        if(mynum) {
            int res = (int) log10(num) + 1;
            System.out.println(res);
        }
    }

}
