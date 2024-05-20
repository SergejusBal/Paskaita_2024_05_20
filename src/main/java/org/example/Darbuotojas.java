package org.example;

import java.math.BigDecimal;


public class Darbuotojas {
    private String vardas;
    private String pavarde;
    private BigDecimal atlyginimas;

    public Darbuotojas(String vardas, String pavarde, BigDecimal atlyginimas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.atlyginimas = atlyginimas;
    }

    public void padidintiAtlyginima(BigDecimal procentas){
        atlyginimas = atlyginimas.multiply(procentas.add(BigDecimal.ONE));
    }
    @Override
    public String toString() {
        return vardas + " " + pavarde + " " + String.format("%.2f",atlyginimas) + " EUR";
    }



}
