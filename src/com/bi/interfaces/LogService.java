package com.bi.interfaces;

import java.io.IOException;

// High Level Class
public class LogService {

    // Low Level Class
    // Console,TextLogger
    private Logger logger;
    // Dependency Inversion Prensibi ile High level ve Low level sınıfların birbirine olan bağımlılığını azalttık. loosely coupled sınıflar oluşturduk.

    public LogService(Logger logger) {
        this.logger = logger;
    }

    public void log(Log log) throws IOException {
        this.logger.log(log);
    }

}
