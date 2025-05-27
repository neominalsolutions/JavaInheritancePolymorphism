package com.bi.inheritancesample;
// Kare,Uçgen,Dijkdörtgen gibi şekillerin alan ve çevre hesaplarını yapar

import java.util.Dictionary;

public class GeometriServisi {

    public void hesapla(Object geometrikSekil){
      // Kare göre
      // Üçgene göre
      // Dikdörtgen
        // type check yaptık
        if(geometrikSekil instanceof Kare){
            // Object olarak gönderiken geometrik sekli kare tipine dönüştürdük. Unboxing
            Kare kare = (Kare)geometrikSekil;
            System.out.println("Kare Alan:" + kare.getKenar() * kare.getKenar());
            System.out.println("Kare Çevre: " + 4 * kare.getKenar());
        } else if(geometrikSekil instanceof Dikdortgen){
            Dikdortgen dikdortgen = (Dikdortgen)geometrikSekil;
            System.out.println("Kare Alan:" + dikdortgen.getUzunKenar() * dikdortgen.getUzunKenar());
            System.out.println("Kare Çevre: " + (2 * dikdortgen.getUzunKenar()) + (2 * dikdortgen.getKisaKenar()));
        } else {
            System.out.println("Şekil Tanımlı değil");
        }
    }
}
