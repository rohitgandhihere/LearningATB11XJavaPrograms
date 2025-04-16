package ex_31_Collection_Framework_DSA_LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab_31_5_LinkedList {

    public static void main(String[] args) {

        List l = new LinkedList();

        l.add("Rohit");
        l.add(111);
        l.add("Gandhi");
        l.add(232);
        l.add(111);

        System.out.println(l);

        for(int i=0;i<=l.size()-1;i++){

            System.out.println(l.get(i));
        }
    }
}
