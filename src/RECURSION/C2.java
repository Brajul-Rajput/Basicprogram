package RECURSION;

public class C2 {
    static void main() {
      nump(1,10);
    }
    public static void nump(int x,int n){
        if(x>n)return;
        System.out.println(x);
        nump(x+1,n);
    }
}
