package com.bi.interfaces;

import java.io.IOException;

public class InterfaceSample {
    public static void main(String[] args) throws IOException {

        var log = new Log("database connection is succesfully","info");

//        Logger logger = new TextLogger();
//        logger.log(log);
//
//        Logger logger2 = new ConsoleLogger();
//        logger2.log(log);

        //2.Yöntem Dependency Injection

        var logger = new TextLogger();
        var logger1 = new ConsoleLogger();

        // Dependecy Injection Polymorphism
        LogService ls = new LogService(logger);
        ls.log(log);

//        LogService ls2 = new LogService(logger1);
//        ls2.log(log);


    }
}
