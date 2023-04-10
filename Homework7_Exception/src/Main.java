import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ФИО");
            String fio = scan.nextLine();
            System.out.println("Введите возраст");
            int age = scan.nextInt();
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Возраст некорректен", age, fio);
            } else if (fio.length() > 200) {
                throw new IncorrectInfoException("Данные некорректены", age, fio);
            }
            System.out.println("Данные приняты.");
            System.out.println("ФИО: " + fio);
            System.out.println("Возраст: " + age);
        } catch (IncorrectInfoException e) {
            e.printStackTrace();

        }
    }
}