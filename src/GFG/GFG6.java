package GFG;

public class GFG6 {
    static void main() {
String s="bhakti";
char ch[]=s.toCharArray();
for(int i=0;i<= ch.length;i++){
    for(int j=i;j<= ch.length;j++){
        System.out.print(s.substring(i,j)+ " ");
    }
    System.out.println();
}

    }

}

