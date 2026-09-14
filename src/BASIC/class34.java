package BASIC;

public class class34 {
    //palidromes
    static void main() {
       palidromes(1210075);

    }
    public static void palidromes(int num) {
        int copy=num;
        int res=0;
        while(num>0){
            int unit=num%10;
            res=res*10+unit;
            num/=10;
        }
        System.out.println(res);
        if(res==copy){
            System.out.println("palindromes");
        }
        else{
            System.out.println("not ");
        }
    }
}
