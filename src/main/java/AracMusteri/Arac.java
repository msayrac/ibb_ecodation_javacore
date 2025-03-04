package AracMusteri;

public class Arac {

    private int yil;
    private String marka;
    private String model;
    private double fiyat;

    public Arac(String marka, String model, int yil, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Arac(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;

    }
    public void bilgileriGoster() {
        System.out.println("Araç: " + marka + ", Yıl: " + yil +" Fiyat: " + fiyat);
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }



}
