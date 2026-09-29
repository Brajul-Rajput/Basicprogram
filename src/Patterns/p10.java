package Patterns;

public class p10 {
    static void main() {
//        for(int i=0;i<5;i++){
//            for(int j=1;j<5;j++){
//                if(i==1 || i==3){
//                    System.out.print((char)(i+96));
//                }
//                else{
//                    System.out.print((char)(i+64));
//                }
//            }
//            System.out.println(" ");
//        }

        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || i==5 ||i==3){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
