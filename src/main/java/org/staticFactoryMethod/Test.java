package org.staticFactoryMethod;
/**
 * “Item 1: Consider static factory methods instead of constructors”
 *“A class can provide a public  static factory method, which is simply a static method that returns an instance of the class”


 */
public class Test {
    public static void main(String[] args) {
        String name = null;
        Yemek yemek = Yemek.sogukYemek(name);

        Fenerbahce fenerbahce = new Fenerbahce("Mesut", 22);
        Fenerbahce fb = Fenerbahce.yeniFutbolcuUret("Ronaldo");
    }
}
