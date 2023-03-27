public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 3;
        int n = 0;
        int m = 0;
        while (a >= c){
            a = a - c;
            n++;
        }
        while (b >= c){
            b = b - c;
            m++;
        }
        System.out.println("Количество квадратов, размещенных на прямоугольнике " +m*n);
    }
}