package org.staticFactoryMethod;

public class Yemek {
    public static Yemek sogukYemek(String name) {
        return new Dondurma();
    }
    public static Yemek sicakYemek(String name) {
        return new Pide();
    }
}