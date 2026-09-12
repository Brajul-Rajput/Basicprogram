package SHASHWAT;

public class practise2 {
    static void main() {
        String location="pune, hyderabad,noida ,bangalore";
        //conert to String aray
        String  ch[]=location.split(",");
       for(int i=0;i<ch.length;i++){
           System.out.print(ch[i]+" ");
       }
    }
}
