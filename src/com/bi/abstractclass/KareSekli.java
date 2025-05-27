package com.bi.abstractclass;

// abstract sınıflar abstract olarak aktarılan öğlerin kullanımını zorlar bunu implementation diyoruz.
public class KareSekli extends GeometrikSekil {

    private int kenar;

    public KareSekli(int kenar) {
        super.setType("Kare");
        this.kenar = kenar;
    }

    @Override
    public double getCevre() {
        return 4* kenar;
    }

    @Override
    public double getAlan() {
        return Math.pow(kenar,2);
    }
}
