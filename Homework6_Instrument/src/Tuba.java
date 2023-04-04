public class Tuba implements Instrument{
    private double diametr;
    public Tuba(double diametr){
        this.diametr=diametr;
    }
    public void play(){
        System.out.println("Играет туба, диаметр "+getDiametr());
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }
}
