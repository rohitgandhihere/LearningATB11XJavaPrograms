package ex_30_Generics;

public class Lab_30_3_Generics_Class {
    public static void main(String[] args) {

        Generics<Integer> genInt=new Generics(1000);
        Generics<String> genStr=new Generics("Rohit");
    }
}

class Generics<T>{
    private T data;

    public Generics(T data){
        this.data=data;
    }

    public T getdata(){
        return this.data;
    }

}