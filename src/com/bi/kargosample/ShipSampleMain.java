package com.bi.kargosample;

import java.time.LocalDate;

public class ShipSampleMain {
    public static void main(String[] args) {
        Ship s1 = new ExpressShip(10, LocalDate.now().plusDays(2));
        var result = s1.calculatePrice(15);
        System.out.println(result);

        Ship s2 = new ExpressShip(100,20,30,LocalDate.now().plusDays(3));
        var result2 = s2.calculatePrice(15);
        System.out.println(result2);
    }
}
