package BASIC;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class arraylist {
    static void main() {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(19);
        list.add(10);
        list.add(1);
        list.add(15);
        list.add(18);
        System.out.println("list is : "+list);
        System.out.println("list size is "+list.size());
        System.out.println(list.get(6));
       System.out.println(     list.get(3));
       System.out.println( list.get(2));
        list.add(2,66);
        list.add(3,34);
       // System.out.println(list);
        System.out.println("list is : "+list);
list.set(2,44);
list.set(3,99);
list.set(4,100);
       System.out.println(list);
        System.out.println("list is : "+list);
       Collections.sort(list);
       System.out.println("list is : "+list);
list.remove(2);
list.remove(4);
list.remove(6);

        System.out.println("list is : "+list);
for(int lid:list)
{
    System.out.println(list);
}
        System.out.println(list.size());
    }
}
