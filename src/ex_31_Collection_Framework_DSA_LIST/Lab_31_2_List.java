package ex_31_Collection_Framework_DSA_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_31_2_List {

    public static void main(String[] args) {

        List fruits = List.of("Orange", "Mango", "Pinapple");

        System.out.println(fruits);



        List l =new ArrayList();

        l.add("Rohit");
        l.add(123);
        l.add(12.33);
        l.add('G');

        System.out.println(l);

    }
}
