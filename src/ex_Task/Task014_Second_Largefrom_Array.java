package ex_Task;

public class Task014_Second_Largefrom_Array {
    public static void main(String[] args) {

        int[] num = {2,11,55,6,11,90,44};
        int large = 0;

        int length=num.length;
        for (int i=0; i<=length-1;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        System.out.println("Max = "+large);
    }

}
