import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array;
        int iMax = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите N ");
        int n = Scan.nextInt();
        System.out.println("Введите A ");
        int a = Scan.nextInt();
        System.out.println("Введите B ");
        int b = Scan.nextInt();
        array = new int[n];
        for (int i=0; i < array.length;i++){
            array[i]=(int)(Math.random()*(b-a)+a);
            System.out.print(array[i]+", ");
        }
       System.out.println();
        for (int i=0; i <array.length;i++){
            if (array[i]>array[iMax]){
                iMax = i;
            }
        }
        System.out.println("Максимальный элемент - "+array[iMax]+" , индекс - "+iMax);
    }
}