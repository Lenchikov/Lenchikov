import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k=0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = Scan.nextLine();
        System.out.println("Введите символ");
        String ch = Scan.nextLine();
        char[] array = str.toCharArray();
        char[] arrayCh = ch.toCharArray();
        for(int i = 0;i<array.length;i++){
            if (array[i]==arrayCh[0]){
                k++;
            }
        }
        System.out.println("Строка - "+str+" символ - "+ch+" результат - "+k);
    }
}