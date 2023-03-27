import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        int temp;
        int iL = -1;
        int iD = -1;
        int kiL = 0;
        int kiD = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int n = Scan.nextInt();
        System.out.println("Введите нижний диапазон ");
        int a = Scan.nextInt();
        System.out.println("Введите верхний диапазон ");
        int b = Scan.nextInt();
        array = new int[n];
        System.out.print("Массив : ");
        for (int i = 0;i<array.length;i++){
            array[i]=(int)(Math.random()*(b-a)+a);
            System.out.print(array[i]+", ");
        }
        System.out.println();
        System.out.print("Отсортированный массив : ");
        for(int j = 0; j<array.length;j++){
        for(int i = 0; i<array.length-1-j;i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        }
        for (int i : array){
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Введите искомое значение ");
        int k = Scan.nextInt();
        for(int i = 0;i<array.length;i++){
            kiL++;
            if (k==array[i]){
                iL=i;
                break;
            }
        }
        int iHight=array.length-1;
        int iLower=0;
        for(int i = 0;i<array.length;i++){
            kiD++;
            if (k==array[(iHight+iLower)/2]) {
                    iD=array[(iHight+iLower)/2];
                    break;
            }else if (k>array[(iHight+iLower)/2]){
                iLower=(iHight+iLower)/2+1;
            }else if (k<array[(iHight+iLower)/2]){
                iHight=(iHight+iLower)/2-1;
            }
        }
        if ((iL!=-1)&&(iD!=-1)){
            System.out.println("Индекс элемента : "+iL);
            System.out.println("Линейный поиск "+kiL+" шаг(-а)(-ов)");
            System.out.println("Двоичный поиск "+kiD+" шаг(-а)(-ов)");
        }else
            System.out.println("Элемент отсутствует!");

    }
}