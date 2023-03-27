public class Main {
    public static void main(String[] args) {
        int n = 2;
        if ( n % 2 == 0) {
           if (n < 9 && n > 0){
               System.out.println("Четное однозначное число");
           } else if (n > 9 && n < 100){
               System.out.println("Четное двухзначное число");
           }else if (n > 99 && n < 1000){
               System.out.println("Четное трехзначное число");
           }
        } else {
            if (n < 9 && n > 0){
                System.out.println("Нечетное однозначное число");
            } else if (n > 9 && n < 100){
                System.out.println("Нечетное двухзначное число");
            }else if (n > 99 && n < 1000){
                System.out.println("Нечетное трехзначное число");
            }
        }
    }
}