package org.example;

public class Gezegen {
    private int siraNumarasi;
    private String adi;
    private double uzaklik; // Güneş'e olan uzaklık
    private double yaricap; // Gezegenin yarıçapı
    private double donmeSuresi; // Gezegenin dönme süresi

    public Gezegen(int siraNumarasi, String adi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.adi = adi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public void gezegenBilgileri() {
        System.out.println(adi);
        System.out.println("Sıra Numarası: " + siraNumarasi);
        System.out.println("Uzaklık: " + uzaklik);
        System.out.println("Yarıçap: " + yaricap);
        System.out.println("Dönme Süresi: " + donmeSuresi);
    }

    public static void main(String[] args) {
        Gezegen merkur = new Gezegen(1, "Merkür", 0.39, 2439.7, 58.6);
        Gezegen venus = new Gezegen(2, "Venüs", 0.72, 6051.8, 243);
        Gezegen dunya = new Gezegen(3, "Dünya", 1, 6371, 1);
        Gezegen mars = new Gezegen(4, "Mars", 1.52, 3389.5, 1.03);
        Gezegen jupiter = new Gezegen(5, "Jüpiter", 5.2, 69911, 0.41);
        Gezegen saturn = new Gezegen(6, "Satürn", 9.58, 58232, 0.45);
        Gezegen uranus = new Gezegen(7, "Uranüs", 19.22, 25362, 0.72);
        Gezegen neptun = new Gezegen(8, "Neptün", 30.05, 24622, 0.67);


        System.out.println("Güneş sistemindeki gezegenlerin listesi: ");
        System.out.println("------------------------------------------");
        merkur.gezegenBilgileri();
        System.out.println("------------------------");
        venus.gezegenBilgileri();
        System.out.println("------------------------");
        dunya.gezegenBilgileri();
        System.out.println("------------------------");
        mars.gezegenBilgileri();
        System.out.println("------------------------");
        jupiter.gezegenBilgileri();
        System.out.println("------------------------");
        saturn.gezegenBilgileri();
        System.out.println("------------------------");
        uranus.gezegenBilgileri();
        System.out.println("------------------------");
        neptun.gezegenBilgileri();
    }
}
