package SHASHWAT;

public class practise3 {
    static void main() {
        String email="brajulrajput@gmail.com";
        String email2="brajulrajput@hotmail.com";
     //   System.out.println(email.split("@"));
        String ch[]=email.split("@");
        for(int i=0;i< ch.length;i++){
            System.out.print(ch[i]+"");
        }
       // System.out.println(email2.split("@"));

    }
}
