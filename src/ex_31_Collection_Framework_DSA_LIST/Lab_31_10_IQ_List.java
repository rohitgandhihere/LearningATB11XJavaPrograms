package ex_31_Collection_Framework_DSA_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_31_10_IQ_List {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(44);
        l.add(11);
        l.add(22);
        l.add(33);

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);



    }
}
