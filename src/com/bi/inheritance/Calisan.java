package com.bi.inheritance;

import java.time.LocalDate;

public class Calisan extends  Kisi{
    private String sicilNo;
    private LocalDate iseGirisTarihi;
    public String getSicilNo() {
        return sicilNo;
    }
    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
    public LocalDate getIseGirisTarihi() {
        return iseGirisTarihi;
    }
    public void setIseGirisTarihi(LocalDate iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }
}
