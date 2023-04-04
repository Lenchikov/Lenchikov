public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[3];
        array[0]= new Guitar(7);
        array[1]= new Drum(20);
        array[2]= new Tuba(14);
        for (Instrument s : array){
            s.play();
        }
    }
}