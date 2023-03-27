public class Main {
    public static void main(String[] args) {
        int year = 2008;
        int day;
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0){
                System.out.println("Колличество дней в году 365");
            }else{
                System.out.println("Колличество дней в году 366");
            }
        }else{
            System.out.println("Колличество дней в году 365");
        }
    }
}