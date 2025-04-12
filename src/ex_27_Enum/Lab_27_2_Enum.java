package ex_27_Enum;

public class Lab_27_2_Enum { public static void main(String[] args) {

    System.out.println(Locators.page_button.getLocators());
    System.out.println(Locators.page_input.getLocators());

    System.out.println(" -- ");
    System.out.println(Colors.RED.getHexCode());
    System.out.println(Colors.GREEN.getHexCode());


    System.out.println(" -- ");
    System.out.println(APIUrls.google.getURL());
    System.out.println(APIUrls.vwo.getURL());
    System.out.println(APIUrls.katalon.getURL());


}

}