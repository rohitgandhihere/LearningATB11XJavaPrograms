package ex_14_StringBuffer_StringBuilder;

public class Lab014_2_Stringbuffer_StringBuilder {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);



    }
}
