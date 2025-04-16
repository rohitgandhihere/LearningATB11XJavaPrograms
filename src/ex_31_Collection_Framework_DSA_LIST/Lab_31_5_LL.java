package ex_31_Collection_Framework_DSA_LIST;

import java.util.LinkedList;

public class Lab_31_5_LL {

    public static void main(String[] args) {


        LinkedList<String> ll =new LinkedList<>();

        ll.add("Dog");
        ll.add("Cat");
        ll.add("Lion");
        ll.add("Tiger");
        ll.add("Cow");
        ll.add("Cow");


        // ll.add(11);

        System.out.println("--------");
        System.out.println(ll);
        System.out.println("First Element : "+ll.getFirst());
        System.out.println("Last Element :"+ll.getLast());
        System.out.println(ll.contains("Cow"));
        System.out.println(ll.indexOf("Dog"));
        System.out.println("--------");
          ll.removeFirst();
          ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.size());



    }
}
