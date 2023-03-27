public class Main {
    public static void main(String[] args) {
       int n = 4;
       int i;
       int f = 1;
       for (i=1;i<=n;i++){
          f=f*i;
       }
       if (n == 0){
           System.out.println(1);
       }else {
           System.out.println(f);
       }
    }
}