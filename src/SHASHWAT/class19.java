package SHASHWAT;

public class class19 {
    static void main() {
      powfind(3,3);
    }
    public  static  void powfind(int num ,int pov){
        int res=1;
        for(int i=1;i<=pov;i++){
            res =num*res;
        }
        System.out.println(res);
    }
}
