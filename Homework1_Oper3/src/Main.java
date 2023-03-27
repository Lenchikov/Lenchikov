public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 4;
        if (a>c && b>c) {
            System.out.println(a+b);
        }else if (b>a && c>a) {
            System.out.println(b+c);
    }else if (c>b && a>b) {
            System.out.println(c+a);
        }
    }
}