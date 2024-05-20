package org.example;

public class ArPirminis {

    public static boolean tikrinti(int n){

        if (n == 1) return true;
        else if (n == 2 ) return true;

        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void spausdintiPirminiusIr11(int x, int y){

        for(int i = x; i <=y; i++ ){
            if(tikrinti(i)) System.out.println(i);
            else if(i % 11 == 0 && i !=11) System.out.println(i);
        }

    }

}
