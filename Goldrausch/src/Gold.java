public class Gold {

    public double unze;

    public void grammInUnze(double gramm){
        this.unze = gramm / 31.1034769;
    }

    public double bekommeGoldwert(double goldTagesPreis){
        return this.unze * goldTagesPreis;
    }

}
