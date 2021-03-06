package com.designpattern.cases.constructor.singleton;

public class StaticInstanceSingleton {

    private static StaticInstanceSingleton uniqueInstance = new StaticInstanceSingleton();

    private StaticInstanceSingleton() {

    }

    public static StaticInstanceSingleton getInstance() {
        return uniqueInstance;
    }

}
