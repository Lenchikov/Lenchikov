import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array;
        int min;
        int max;
        int n;
        Scanner Scan = new Scanner(System.in);
        do {
            System.out.println("Введите размер массива ");
            n = Scan.nextInt();
        }
        while (n<=0);
        do {
            System.out.println("Введите нижний диапазон ");
            min = Scan.nextInt();
            System.out.println("Введите верхний диапазон ");
            max = Scan.nextInt();
        }
        while (min>max);
        array = new int[n];
        for (int i = 1; i < array.length;i++){
            array[i]=(int)(Math.random()*(max-min)+min);
            System.out.print(array[i]+", ");
        }
    }
}