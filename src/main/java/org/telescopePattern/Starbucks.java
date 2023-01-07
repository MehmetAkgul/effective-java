package org.telescopePattern;

public class Starbucks {
    // gerekli fileds
    private String kahveBoyutu;

    // optional istege bagli alalnlar
    private String laktozsuz;
    private String yumusatici;

    public Starbucks(String kahveBoyutu) {
        super();
        this.kahveBoyutu = kahveBoyutu;
    }

    public Starbucks(String boyut, String miktar) {
        super();
        this.kahveBoyutu = boyut;
        this.laktozsuz = miktar;
    }
}
