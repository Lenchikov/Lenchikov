public class Guitar implements Instrument{
    private int kolStrun;

    public Guitar(int kolStrun){
        this.kolStrun=kolStrun;
    }

    public void play(){
        System.out.println("Играет гитара, с колличеством струн "+getKolStrun());
    }

    public void setKolStrun(int kolStrun) {
        kolStrun = kolStrun;
    }

    public int getKolStrun() {
        return kolStrun;
    }
}
