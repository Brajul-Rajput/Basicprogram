package BASIC;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    static void main() {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(1);

        set.add(5);
        set.add(6);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.contains(9));
        System.out.println(set.size());
        System.out.println(set.remove(4));
       System.out.println(set.remove(10));
        System.out.println(set);
        //System.out.println(set.wait());
           System.out.println(set.hashCode());
        Iterator it=set.iterator();
        /*{
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
        */

        while(it.hasNext())

            {
                System.out.println(it.next());
            }
        }

}
