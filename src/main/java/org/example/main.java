package org.example;

public class main {

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
