package com.bi.kargosample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExpressShip extends Ship {
    private LocalDate shipDate;

    public ExpressShip(double weight,LocalDate shipDate) {
        super(weight);
        this.shipDate = shipDate;
    }

    public ExpressShip(double height, double width, double length, LocalDate shipDate) {
        super(height, width, length);
        this.shipDate = shipDate;
    }

    @Override
    public double calculatePrice(double unitPrice) {

        DayOfWeek dayOfWeek = shipDate.getDayOfWeek();

        System.out.println("sonuc " + super.calculatePrice(unitPrice));

        // Birim fiyat üzerinden %20 fazlası
        if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return super.calculatePrice(unitPrice) * 1.20;
        } else {
            return super.calculatePrice(unitPrice);
        }

    }
}
