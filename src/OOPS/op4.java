package OOPS;

import com.sun.security.jgss.GSSUtil;

public class op4 {
    static void main() {
        dem ff=new dem();
        dem ff1=new dem(10);
        dem ff2=new dem("rohan",23.4);
        dem fr=new dem(34.2f);

    }
}

class dem{

    dem(){
       String name;
    }
    dem(int a){
        System.out.println(a);
    }
    dem(String f,double g){
        System.out.println(f);
        System.out.println(g);
    }
    dem(float v){
        System.out.println(v);
    }
}