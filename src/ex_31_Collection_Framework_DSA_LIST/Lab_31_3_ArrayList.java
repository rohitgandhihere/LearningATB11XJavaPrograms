package ex_31_Collection_Framework_DSA_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_31_3_ArrayList {
    public static void main(String[] args) {

        List l = new ArrayList();

        l.add("rohit");
        l.add(4);
        l.add("gandhi");

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());

        ArrayList al = new ArrayList();

        al.add("Rohit");
        al.add(111);
        al.add("Gandhi");
        al.add('d');

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());

    }
}
