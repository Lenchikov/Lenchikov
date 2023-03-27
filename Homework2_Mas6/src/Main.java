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
        for (int i = 0 ; i<array.length;i++){
            array[i]=(int)(Math.random()*(b-a)+b);
            System.out.print(array[i]+", ");
        }
        for(int i =0;i<array.length/2;i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println();
        for(int i : array){
            System.out.print(i+", ");
        }
    }
}