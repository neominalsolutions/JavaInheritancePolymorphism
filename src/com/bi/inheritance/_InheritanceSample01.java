package com.bi.inheritance;

import java.time.LocalDate;
import java.util.ArrayList;

public class _InheritanceSample01 {
    public static void main(String[] args) {
        Kisi kisi = new Calisan();

        Calisan calisan = new Calisan();
        calisan.setIseGirisTarihi(LocalDate.of(2025, 1, 1));
        calisan.setSicilNo("324324324");
        calisan.setAd("Ali"); // Kisi sınıfından geldi.
        calisan.setSoyad("Tan");
        calisan.getFullName();

        Musteri musteri = new Musteri();
        musteri.setAd("Ahmet");
        musteri.setSoyad("Tan");
        musteri.setAdres("İstanbul");
        musteri.setTelefon("5455001023");
        musteri.getFullName();
        System.out.println(musteri.getFullName());
        // Not: Kalıtım sayesinde base sınıf üzerinden çalışabiliriz.
        ArrayList<Kisi> kisiler = new ArrayList<>();
        kisiler.add(calisan);
        kisiler.add(musteri);

    }
}
