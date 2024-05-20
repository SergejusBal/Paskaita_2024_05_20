package org.example;

import java.util.Random;

public class Vektorius {

    double[] vektorius;

    public Vektorius() {

    }

    public Vektorius(double[] vektorius) {
        this.vektorius = vektorius;
    }

    public double[] getVektorius() {
        return vektorius;
    }

    public void sugeneruotiVektoriu(int dydis){
        Random random = new Random();
        double[] vektoriusLentele = new double[dydis];

        for (int i = 0; i < dydis; i++) {
                vektoriusLentele[i] = (double) random.nextInt(0,10000) / 100;
        }
        vektorius = vektoriusLentele;
    }

    public static Vektorius daugintiIsMatricos(Matrica m1, Vektorius v1){
        Vektorius returnVektorius = new Vektorius(new double[v1.getVektorius().length]);

        for (int i = 0; i < m1.getMatrica().length; i++) {
            double temp;
            for (int j = 0; j < m1.getMatrica().length; j++) {
               temp =  m1.getMatrica()[i][j] * v1.getVektorius()[j];
               returnVektorius.getVektorius()[i] += temp;
            }

        }
        return returnVektorius;
    }




    @Override
    public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < vektorius.length; i++) {
                    stringBuilder.append(String.format("%.2f", vektorius[i])).append(" ");
            }
            return stringBuilder.toString();
    }
}
