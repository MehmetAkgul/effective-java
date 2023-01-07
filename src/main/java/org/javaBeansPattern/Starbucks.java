package org.javaBeansPattern;

public class Starbucks {
    // gerekli fileds
    private String kahveBoyutu;

    // optional istege bagli alalnlar
    private String laktozsuz;
    private String yumusatici;

    public Starbucks(){ }

    public void setKahveBoyutu(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public void setLaktozsuz(String laktozsuz) {
        this.laktozsuz = laktozsuz;
    }

    public void setYumusatici(String yumusatici) {
        this.yumusatici = yumusatici;
    }
}
