package AracMusteri;

public class Musteri {

    private Arac arac;
    private String isim;
    private String soyisim;
    private double bakiye;

    public Musteri(String isim, String soyisim, double bakiye, Arac arac) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bakiye = bakiye;
        this.arac = arac;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void bakiyeYeterliMi() {
        if (bakiye >= arac.getFiyat()) {
            System.out.println("Bakiye yeterli.");
        } else {
            System.out.println("Bakiye yetersiz.");
        }
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim + ", Soyisim: " + soyisim + ", Bakiye: " + bakiye);
        // arac.bilgileriGoster();
    }

    public double getBakiye() {
        bakiye =bakiye-arac.getFiyat();
        System.out.println(arac.getFiyat()-bakiye + " eksik kalan bakiye");
        return bakiye;
//

    }

}
