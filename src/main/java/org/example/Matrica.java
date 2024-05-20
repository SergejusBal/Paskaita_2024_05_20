package org.example;

import java.util.Arrays;
import java.util.Random;

public class Matrica {

    private double[][] matrica;

    public Matrica(){
        matrica = new double[0][0];
    }
    public Matrica(double[][] matrica) {
        this.matrica = matrica;
    }

    public double[][] getMatrica() {
        return matrica;
    }

    public void sugeneruotiMatrica(int dydis){
        Random random = new Random();
        double[][] matricosLentele = new double[dydis][dydis];
        matrica = matricosLentele;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                matrica[i][j] = (double) random.nextInt(0,10000) / 100;
            }
        }
    }
    public void transponavimas(){
        double[][] matricosLentele = new double[matrica.length][matrica.length];
        for (int i = 0; i < matricosLentele.length; i++) {
            for (int j = 0; j < matricosLentele[i].length; j++) {
                matricosLentele[i][j] = matrica[j][i];
            }
        }
        matrica = matricosLentele;
    }
    public static Matrica sudeti(Matrica m1, Matrica m2){
        double[][] matricosLentele = new double[m1.getMatrica().length][m1.getMatrica().length];
        Matrica sudetimatrica = new Matrica(matricosLentele);

        for (int i = 0; i < m1.getMatrica().length; i++) {
            for (int j = 0; j < m1.getMatrica().length; j++) {
                sudetimatrica.getMatrica()[i][j] =  m1.getMatrica()[i][j] + m2.getMatrica()[i][j];
            }
        }
        return sudetimatrica;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                stringBuilder.append(String.format("%.2f", matrica[i][j])).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
