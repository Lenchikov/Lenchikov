public class Main {
    public static void main(String[] args) {
        Animal[] array = new Animal[3];
        array[0]=new Cat();
        array[1]=new Dog();
        array[2]=new Rat();
        for(Animal s : array){
            s.makeNoise();
        }

    }
}