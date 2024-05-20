package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Studentas {
    private String vardas;
    private String pavarde;
    private List<Integer> pazymiai;


    public Studentas(String vardas, String pavarde, int kiekis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pazymiai = sugeneruotiPazymius(kiekis);
    }

    public double skVidurkis(){
        int suma = 0;
        for(int i = 0; i < pazymiai.size(); i++){
            suma += pazymiai.get(i);
        }
        return (double) suma /pazymiai.size();
    }

    public List<Integer> sugeneruotiPazymius(int n){
        Random random = new Random();
        List<Integer> generacija = new ArrayList<>();
        for(int i =0; i < n; i++){
            generacija.add(random.nextInt(1,10));
        }
        return generacija;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " " + String.format("%.2f",skVidurkis());
    }
}
