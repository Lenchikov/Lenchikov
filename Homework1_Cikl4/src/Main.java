public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int i;
        int n=0;
        for (i=b-1;i>a;i--){
            System.out.println(i);
            n++;
        }
        System.out.println("Количество чисел "+n);
    }
}