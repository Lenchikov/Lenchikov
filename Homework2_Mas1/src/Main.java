import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner Scan = new Scanner(System.in);
        int min = 10;
        int max = 99;
        int p = 0;
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*(max-min)+min);
            System.out.print(array[i]+", ");
        }
        System.out.println();
        for (int i = 0; i< array.length-1;i++){
            if (array[i]<array[i+1]){
                p = 0;
            }else {
                p = 1;
                break;
            };
        }
        if (p == 1) {
            System.out.println("Последовательность не строго возрастающая");
        } else
            System.out.println("Последовательность строго возрастающая");
    }
}