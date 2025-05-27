package com.bi.inheritance;
// Not: 1 kalıtım ile ortak özellikler tekrar yazılmaz
// Not:2 kalıtım ile varolan davranışlar, kalıtım alınan sınıflarda değiştirilebilir
public class Musteri extends  Kisi{
    private String adres;
    private String telefon;
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getAdres() {
        return adres;
    }
    // Kisi sınıfındaki davranışı değiştiridim.
    @Override
    public String getFullName() {
        return super.getFullName() + " (" + this.telefon + ") ";
    }
}
