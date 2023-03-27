import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k=0;
        String str;
        Scanner Scan = new Scanner(System.in);
        do {
            System.out.println("Введите строку ");
            str = Scan.nextLine();
            if (str.isEmpty()) {
                k=0;
            } else {
                k=1;}
        }
        while (k==0);
        char[] array = str.toCharArray();
        System.out.println("Введите символ a ");
        String a = Scan.nextLine();
        char[] arrayA = a.toCharArray();
        System.out.println("Введите символ b");
        String b = Scan.nextLine();
        char[] arrayB = b.toCharArray();
        for (int i = 0;i<array.length;i++){
            if (array[i]==arrayA[0]){
                array[i]=arrayB[0];
            }
        }
        String str1 = new String(array);
        System.out.println("Строка - "+str+", символы - "+a+" "+b+", результат "+str1);
    }
}