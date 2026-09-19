package OOPS;

public class oops8 {
    static void main() {


        c9 dfg = new c9(12);
        c9 d = new c9(12, "name");
        c9 ds = new c9(23.4f);
    }
}
class c9{
    c9(int x){
        System.out.println(x);
    }
    c9(int y,String v ){
        System.out.println(y+" "+v);
    }
    c9(float z){
        System.out.println(z);
    }
}
