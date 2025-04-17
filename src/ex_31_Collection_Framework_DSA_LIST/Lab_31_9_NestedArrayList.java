package ex_31_Collection_Framework_DSA_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_31_9_NestedArrayList {
    public static void main(String[] args) {

        List <String> fruits =new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Fig");
        fruits.add("Papaya");
        fruits.add("Pinapple");

        ArrayList vegi =new ArrayList();

        vegi.add("Tomato");
        vegi.add("Lemon");
        vegi.add("Potato");

        List fruits1 = new ArrayList();

        fruits1.add("Coconut");
        fruits1.add("WaterMelon");


        List all = new ArrayList() ;

        all.add(fruits1);
        all.add(fruits);
        all.add(vegi);

        System.out.println(all);

    }
}
