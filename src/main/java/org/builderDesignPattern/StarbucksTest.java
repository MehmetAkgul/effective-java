package org.builderDesignPattern;

public class StarbucksTest {
    public static void main(String[] args) {

        String boyut = "orta";
        String miktar = "az";
        Starbucks sb = new Starbucks.Builder(boyut)
                .yumusakIcim(miktar)
                .laktozsuzTayfa(miktar)
                .build();
        Starbucks sb2 = new Starbucks.Builder(boyut)
                .yumusakIcim(miktar)
                .build();

    }
}
