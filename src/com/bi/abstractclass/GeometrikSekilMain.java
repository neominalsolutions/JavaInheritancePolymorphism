package com.bi.abstractclass;

import com.bi.inheritance.Kisi;
import com.bi.inheritancesample.Dikdortgen;
import com.bi.inheritancesample.GeometriServisi;
import com.bi.inheritancesample.GeometrikSekilService;
import com.bi.inheritancesample.Kare;

public class GeometrikSekilMain {
    public static void main(String[] args) {

        Kare k = new Kare(10);

        GeometriServisi goes = new GeometriServisi();
        goes.hesapla(k);

        Dikdortgen d = new Dikdortgen(10,20);

        GeometriServisi goes2 = new GeometriServisi();
        goes2.hesapla(d);

        GeometriServisi goes3 = new GeometriServisi();
        goes3.hesapla(new Kisi());


        GeometrikSekilService gs1 = new GeometrikSekilService(10);
        System.out.println("Kare Alan " + gs1.getAlan());
        System.out.println("Kare Çevre " + gs1.getCevre());


        GeometrikSekilService gs2 = new GeometrikSekilService(10,20);
        gs2.getAlan();
        gs2.getCevre();
        System.out.println("Dk Alan " + gs2.getAlan());
        System.out.println("Dk Çevre " + gs2.getCevre());
    }
}
