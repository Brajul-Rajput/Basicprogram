package GFG;

public class GFG5 {
    static void main() {
        String s="nitin";
       int i=0;
       int j=s.length()-1;
       while(i<=j){
           if(s.charAt(i)!=s.charAt(j)){
               System.out.println("no");
              i++;
              j--;
           }
           // System.out.println("yes");
       }
        System.out.println("yes");
    }
}
