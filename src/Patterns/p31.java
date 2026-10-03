package Patterns;

public class p31 {
    static void main() {
        String ss=new String ("welcome to the code channel with and with your family ");
        char ch[]=ss.toCharArray();
        for(int i=0;i<=ch.length;i++){

//                System.out.println(i);
//            }
            int num=(char)65;
            for(int j=num;j<='z';j++){
                if(ch[i]==j){
                    System.out.println("true ");
                }
                else{
                    System.out.println("false ");
                }
            }
        }
    }
}
