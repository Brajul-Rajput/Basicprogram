package OOPS;

public class oops6 {
    static void main() {
       c7 dfs=new c7();
       c7 df=new c7(dfs);
    }
}
class c7{
    int a;
    String name;
    boolean f;
    float d;
c7(){
  a=10;
  name="tannu";
  f=true;
  d=23.43f;
}
c7(c7 ref){
    a=ref.a;
    name=ref.name;
    f=ref.f;
    d=ref.d;
    System.out.println(a+" "+name+" "+f+" "+d);

}
}