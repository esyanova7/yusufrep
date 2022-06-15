package task.pack;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {15,47,63,7,17,31,101,3,144,10};
        int max=array[0];
        int min=array[0];
        for (int check:array) {
            if(check > max) {
                max=check;
            }else if (check < min) {
                min=check;
            }
        }
        System.out.println(max);

        System.out.println(min);
    }

}