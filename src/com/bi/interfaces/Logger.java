package com.bi.interfaces;

import java.io.IOException;

// interface içerisindeki tüm üyeler public tanımlanır
// Not: Interfaceler olabildiğince atomik tanımlanmalıdır. Yoksa Interface Seggregation Prensibine aykırı düşer.
public interface Logger {
    void log(Log log) throws IOException; // abstract sınıflara
    // benzer fakat farklı nesne grupoları ile çalışabilir.
    // Amaç; ortak bir arayüz üzerinden benzer şekilde işlem yaptırmak.
//    void setLogLevel(String level);
}


