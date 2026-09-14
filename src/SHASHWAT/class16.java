package SHASHWAT;

import static java.lang.Math.log10;

public class class16 {
    static void main() {
        class16 sm=new class16();
        sm.frontdigit(3425,9);
    }
    public void frontdigit(int num ,int font){
        int res=(int)log10(num)+1;
        int ress=font*(int)Math.pow(10,res)+num;
        System.out.println(ress);

    }
}
