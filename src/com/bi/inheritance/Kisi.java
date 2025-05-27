package com.bi.inheritance;
// base class, parent class
public class Kisi {
    private String ad;
    private String Soyad;
    public void  setAd(String ad) {
        this.ad = ad;
    }
    public void  setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return Soyad;
    }
    public String getFullName() {
        return new StringBuilder().append(ad).append(" ").append(Soyad).toString();
    }
}
