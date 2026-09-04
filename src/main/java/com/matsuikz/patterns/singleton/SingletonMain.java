package com.matsuikz.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        System.out.println(log);
        Logger log1 = Logger.getInstance();
        System.out.println(log1);
    }
}
