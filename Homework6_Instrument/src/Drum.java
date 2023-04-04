public class Drum implements Instrument{
    private int size;

    public Drum(int size){
        this.size=size;
    }
    public void play(){
        System.out.println("Играет барабан, размер "+getSize());
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
