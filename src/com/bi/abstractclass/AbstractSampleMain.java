package com.bi.abstractclass;

import java.util.Scanner;

public class AbstractSampleMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Şekil Tipi seç ");
        String sekilTipi = scanner.nextLine();




        if(sekilTipi.equals("Kare")) {
            System.out.println("Karenin kenarını giriniz");
            int kenar = scanner.nextInt();
            GeometrikSekil sekil = new KareSekli(kenar);
            double alan = sekil.getAlan();
            double cevre = sekil.getCevre();

            System.out.println(alan + " " + cevre);

        } else if(sekilTipi.equals("Dikdörtgen")) {
            System.out.println("Uzun kenarını giriniz");
            int uzunKenar = scanner.nextInt();

            System.out.println("Kısa kenarını giriniz");
            int kisaKenar = scanner.nextInt();

            GeometrikSekil sekil = new DikdortgenSekli(uzunKenar,kisaKenar);
            double alan = sekil.getAlan();
            double cevre = sekil.getCevre();

            System.out.println(alan + " " + cevre);
        }


        GeometrikSekil sekil = new DikdortgenSekli(10,20);
        sekil.getAlan();
        sekil.getCevre();

        GeometrikSekil sekil2 = new KareSekli(10);
        sekil2.getAlan();
        sekil2.getCevre();
    }






}
