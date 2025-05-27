package com.bi.interfaces;

import javax.swing.text.DateFormatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// bir sınıf birden fazla interfaceden yetenek özellik alabilir.
public class TextLogger implements Logger,LogLevel{
    private String logLevel;
    @Override
    public void log(Log log) throws IOException {

        FileWriter fw = new FileWriter("log.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // saat bilgisi ekledik
        LocalDateTime date = LocalDateTime.now();
        String formatedDate = dtf.format(date);

        bw.write(new StringBuilder()
                .append(log.getLevel())
                .append("->")
                .append(log.getMessage())
                .append(" Tarih/Saat ")
                .append(formatedDate).toString());
        bw.close();
        // info -> database connection is succesfully 10/24/2025 10:30
    }

    @Override
    public void setLogLevel(String level) {
        this.logLevel = level;
    }
}
