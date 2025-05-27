package com.bi.abstractclass;

public class DikdortgenSekli extends GeometrikSekil {

    private int kisaKenar;
    private int uzunKenar;

    public DikdortgenSekli(int kisaKenar, int uzunKenar) {
        super.setType("Dikdortgen");
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }


    @Override
    public double getCevre() {
        return (2 * this.kisaKenar) + (2 * this.uzunKenar);
    }

    @Override
    public double getAlan() {
        return this.kisaKenar * this.uzunKenar;
    }
}
