package ex_13_Strings;

public class Lab013_7_Interview_Count_Substring {

    public static void main(String[] args) {

        String str1 = "I am clever hence I am Gunius hence I am great I";
        String substring = "I";
        check(str1,substring);
    }

    public static void check(String str, String str1){
        int count =0;
        String[] s = str.split(" ");
        for (int i=0;i<=s.length-1;i++){
            if(str1.equals(s[i])){
                count++;
            }
        }
        System.out.println("Total - "+count);
    }


}
