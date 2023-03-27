public class Main {
    public static void main(String[] args) {
        int n = 1000;
        int p = 10;
        int k = 0;
        double s = 0;
        while (s <= 100){
           s = s+n*p/100;
           k++;
        }
        s=s+n;
        System.out.println("Количество месяцев "+k);
        System.out.println("Итоговый размер вклада "+ s);
    }
}