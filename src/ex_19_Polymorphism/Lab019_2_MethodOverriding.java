package ex_19_Polymorphism;

public class Lab019_2_MethodOverriding {

    public static void main(String[] args) {

            Dog d=new Dog();
            d.sound();


    }
}

class Animal{


    void sound() {

        System.out.println("Animal sound!!");
    }

}

class Dog extends Animal {


    void sound() {

        System.out.println("Bark!!");
    }


}