package ex_31_Collection_Framework_DSA_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_31_4_AL {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add("Rohit");
        l.add("Anaya");
        l.add(223);
        l.add(1);
        l.add(112);
        l.add(1);
        l.add("Rohit");

        System.out.println(l);
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("Rohit"));
        System.out.println(l.indexOf(1));
        System.out.println(l.lastIndexOf(1));

        System.out.println("-----------------");
        for (int i=0;i<=l.size()-1;i++){
            System.out.println(l.get(i));
        }

        l.clear();
        System.out.println(l);
    }


}
