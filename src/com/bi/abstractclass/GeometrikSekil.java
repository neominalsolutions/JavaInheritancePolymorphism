package com.bi.abstractclass;

// Soyut bir sınıf sadece extends edilebilir
// İnstance alınamaz
// abstract sınıfların abstract üyeleir olabilir.
// bu üyelerin için boş bırakılır.
// normal getter setterda olabilir field da olabilir.
public abstract class GeometrikSekil {

    private String type;
    // Kare Dikdörtgen, Üçgen
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // sadece bu iş böyle yapısın dedik. Nasıl yapılacağını bilmiyoruz
    public abstract double getCevre();
    public abstract double getAlan();

}
