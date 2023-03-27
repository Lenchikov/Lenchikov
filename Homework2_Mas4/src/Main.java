import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        int temp;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите N ");
        int n = Scan.nextInt();
        System.out.println("Введите A ");
        int a = Scan.nextInt();
        System.out.println("Введите B ");
        int b = Scan.nextInt();
        array = new int[n];
        for (int i = 0; i<array.length;i++){
            array[i]=(int)(Math.random()*(b-a)+a);
            System.out.print(array[i]+", ");
        }
        for (int j = 0;j<array.length;j++){
        for (int i = 0;i<array.length-j-1;i++){
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        }
        System.out.println();
        for (int i : array){
          System.out.print(i+", ");
        }
    }
}