import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int [] mas = new int[10000];
//        Random random = new Random();
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = random.nextInt(10000);
//        }
//        long start = System.currentTimeMillis();
//        Sort.bubSort(mas);
//        System.out.println(System.currentTimeMillis() - start);
//
//        Sort.quickSort(mas, 0, mas.length -1);
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = random.nextInt(10000);
//        }
//        start = System.currentTimeMillis();
//        System.out.println(Arrays.toString(mas));
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        Sort.heapSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}