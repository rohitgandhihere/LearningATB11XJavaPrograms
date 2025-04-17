package ex_31_Collection_Framework_DSA_LIST;

import java.util.*;

public class Lab_31_8_Vector {

    public static void main(String[] args) {


        Vector v= new Vector();

        v.add("Rohit");
        v.add("Gandhi");
        v.add(122);
        System.out.println(v);

        System.out.println(v.contains("Rohit"));

        for (int i=0;i<=v.size()-1;i++){

            System.out.println(v.get(i));
        }
        System.out.println("---------");

        for (Object o: v){
            System.out.println(o);

        }
        System.out.println("-------");

        Iterator it =v.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
        System.out.println("---------");
        Enumeration<Objects> en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

        System.out.println("-------");

        ListIterator li = v.listIterator();
            while (li.hasNext()){

            System.out.println(li.next());
            }

    }
}
