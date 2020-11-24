public class DVD extends Article {

    public static float vat = 0.19f;

    private String name;
    private int duration;
    private int countryCode;

    public DVD(int articleNumber, float price, String name, int duration, int countryCode){
        super(articleNumber, price);
        setName(name);
        setDuration(duration);
        setCountryCode(countryCode);
    }

    @Override
    public float getPrice(){
        return super.getPrice() + (super.getPrice() * vat);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
}
