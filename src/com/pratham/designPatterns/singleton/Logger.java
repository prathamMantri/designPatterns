package com.pratham.designPatterns.singleton;

public class Logger implements Cloneable {

    public static Logger instance;

    private Logger(){

    }

    public static Logger getInstance(){
        if(instance==null) {
            synchronized (Logger.class) {
                if(instance==null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
