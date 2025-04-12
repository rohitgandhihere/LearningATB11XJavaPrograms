package ex_27_Enum;

public class Lab_27_1_Enum {
    public static void main(String[] args) {

        System.out.println(Project_URLs.katalon);
        System.out.println(Day.FRIDAY);

    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_URLs{
    google, katalon, vwo, restassured
}
