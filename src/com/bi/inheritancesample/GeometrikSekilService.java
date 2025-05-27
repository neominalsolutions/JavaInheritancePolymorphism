package com.bi.inheritancesample;

import com.bi.abstractclass.DikdortgenSekli;
import com.bi.abstractclass.GeometrikSekil;
import com.bi.abstractclass.KareSekli;

// üst seviye sınıflar
// üst seviye sınıf alt seviye soınıfın işlemlerini yapabilmek için bir arayüz oluşuturur. UI dan direk bu sınıf çağırılır.Böyle kodu daha okunabilir yönetilebilir hale getiririz.
// Facade Design pattern
public class GeometrikSekilService {

    private int kenar1;
    private int kenar2;
    // alt seviye sınıflar
    // asıl işi alt seviye sınıf yapar
    private GeometrikSekil sekil;

    public GeometrikSekilService(int kenar1) {
        this.kenar1 = kenar1;
        this.sekil = new KareSekli(kenar1);
    }

    public GeometrikSekilService(int kenar1, int kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.sekil = new DikdortgenSekli(kenar1,kenar2);
    }

    public double getCevre() {
        return  sekil.getCevre();
    }

    public double getAlan() {
        return  sekil.getAlan();
    }


}
