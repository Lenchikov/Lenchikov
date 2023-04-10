import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str="3+56";
        String str2="3-56";
        String str3="3*56";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append("=").append(3+56);
        System.out.println(strBuilder.toString());
        StringBuilder strBuilder2 = new StringBuilder(str2);
        strBuilder2.append("=").append(3-56);
        System.out.println(strBuilder2.toString());
        StringBuilder strBuilder3 = new StringBuilder(str3);
        strBuilder3.append("=").append(3*56);
        System.out.println(strBuilder3.toString());
        strBuilder3.replace(4,5," равно ");
        System.out.println(strBuilder3.toString());
        String strReg ="^\\w+\\.com$";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ссылку для проверки");
        String str4 = scan.nextLine();
        System.out.println(Pattern.matches(strReg,str4));
        String strReg2 ="a\\wb";
        String str5 = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile(strReg2);
        Matcher matcher = pattern.matcher(str5);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        String str6 = "ab abab abab abababab abea";
        String strReg3 ="(ab)+";
        Pattern pattern2 = Pattern.compile(strReg3);
        Matcher matcher2 = pattern2.matcher(str6);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите дату");
        String str7 = scan2.nextLine();
        String strReg4 ="((1[0-9]{3})|(20(0|1)[0-2]))\\/((0[0-9])|(1[0-2]))\\/([0-2][0-9]|30) (((0|1)[0-9])|(2[0-4])):([0-5][0-9])";
        if (str7.matches(strReg4)){
            System.out.println(str7 + " существует");
        }
        else
        {
            System.out.println(str7 + " не существует");
        }
    }
}