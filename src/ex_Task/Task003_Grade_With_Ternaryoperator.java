package ex_Task;

public class Task003_Grade_With_Ternaryoperator {

    public static void main(String[] args) {

//        A: 90-100  B: 80-89  C: 70-79 D: 60-69  E: 0-59

       // String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        //int marks= 61;
        String marks1 = args[0];
        Integer marks = Integer.parseInt(marks1);
        String result = (marks>90) ? "A" : (marks>80)? "B":(marks>70)?"C":(marks>60)?"D":"E";

        System.out.println("Result = "+result);
    }
}
