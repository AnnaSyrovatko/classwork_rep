import java.util.Random;

public class Classwork {
    public static void main(String[] args) {

        // Метод, который выводит получает масссив целых чисел, и возвращает последнее число в массиве, которое меньше 0

        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
            System.out.print(array[i] + " | ");

        }
        System.out.println();


        System.out.println(minNumber(array));



    }
    public static int minNumber (int[] arr){
        int result = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0 && i > index){
                result = arr[i];
                index = i;
            }
        }

        return result;
    }
}
