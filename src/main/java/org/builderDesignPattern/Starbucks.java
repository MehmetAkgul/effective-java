package org.builderDesignPattern;

public class Starbucks {
    // gerekli fileds
    private String kahveBoyutu;

    // optional istege bagli alalnlar
    private String laktozsuz;
    private String yumusatici;


    public static class Builder {

        // gerekli fileds
        private final String kahveBoyutu;

        // optional istege bagli alalnlar
        private String laktozsuz;
        private String yumusatici;

        public Builder(String kahveBoyutu) {
            super();
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozsuzTayfa(String laktozsuzSut) {
            laktozsuz = laktozsuzSut;
            return this;
        }

        public Builder yumusakIcim(String yumusaticiDeger) {
            yumusatici = yumusaticiDeger;
            return this;
        }

        public Starbucks build() {
            return new Starbucks(this);
        }


    }
    public Starbucks(Builder builder) {
        kahveBoyutu=builder.kahveBoyutu;
        laktozsuz=builder.laktozsuz;
        yumusatici=builder.yumusatici;
    }

}
