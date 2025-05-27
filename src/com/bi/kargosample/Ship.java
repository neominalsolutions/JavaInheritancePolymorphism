package com.bi.kargosample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Ship implements PriceCalculator {
    private double weight;
    private double height;
    private double length;
    private double width;

    // ağır bir cisimse
    public Ship(double weight) {
        this.weight = weight;
    }

    // hafifse
    public Ship(double height, double width, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public double getWeight() {

        double volume = 0;

        if (this.height != 0 && this.length != 0 && this.width != 0){
             volume = (this.width * this.height * this.length) / 5000;
        }

        if(volume > this.weight){
            this.weight = volume;
        }

       return this.weight;
    }

    @Override
    public double calculatePrice(double unitPrice) {

        System.out.println("unitPrice1 ->" + this.getWeight());

        System.out.println("unitPrice2 ->" + this.getWeight() * unitPrice);

        return this.getWeight() * unitPrice;
    }
}
