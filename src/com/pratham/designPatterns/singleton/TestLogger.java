package com.pratham.designPatterns.singleton;

import java.io.*;

public class TestLogger {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        Logger logger = Logger.getInstance();
        String message = "Logger class is implemented in Singleton Design Pattern";
        logger.log(message);

    }

}
