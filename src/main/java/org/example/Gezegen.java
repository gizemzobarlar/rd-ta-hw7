public enum Gezegen {
    MERKUR(1, 0.39, 2439.7, 58.6),
    VENUS(2, 0.72, 6051.8, 243),
    DUNYA(3, 1, 6371, 1),
    MARS(4, 1.52, 3389.5, 1.03),
    JUPITER(5, 5.2, 69911, 0.41),
    SATURN(6, 9.58, 58232, 0.45),
    URANUS(7, 19.22, 25362, 0.72),
    NEPTUN(8, 30.05, 24622, 0.67);

    private final int siraNumarasi;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    Gezegen(int siraNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    // Main metodu
    public static void main(String[] args) {
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println(gezegen.name() + ":");
            System.out.println("Sıra Numarası: " + gezegen.getSiraNumarasi());
            System.out.println("Uzaklık: " + gezegen.getUzaklik());
            System.out.println("Yarıçap: " + gezegen.getYaricap());
            System.out.println("Dönme Süresi: " + gezegen.getDonmeSuresi());
            System.out.println("------------------------");
        }
    }
}
