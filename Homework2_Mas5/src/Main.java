import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int nIndex =-1;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите N ");
        int n = Scan.nextInt();
        for (int i : array){
            System.out.print(i+", ");
        }
        for (int i = 0 ; i<array.length;i++){
            if (array[i]==n){
                nIndex = i;
                break;
            }
        }
        System.out.println();
        if (nIndex>-1) {
            System.out.println("Индекс - "+ nIndex);
        }else
            System.out.println("Элемент не найден!");
    }
}