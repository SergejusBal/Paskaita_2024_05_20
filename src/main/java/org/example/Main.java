package org.example;


import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //1. Užduotis:
        //Parašykite programą kuri prašo įvesti intervalą NUO/IKI ir jame atspausdina pirminius skaičius ir skaičius kurie dalinasi iš 11 be liekanos

        System.out.println("Įveskite skaičių ribas:");
        System.out.println("Pradžia:");
        int x = Custom.nuskaitytiIntVerteCon();
        System.out.println("Pabaiga:");
        int y = Custom.nuskaitytiIntVerteCon();
        ArPirminis.spausdintiPirminiusIr11(x,y);

        //2. Užduotis: Sukurkite programą, kuri naudoja while ciklą, norint suskaičiuoti ir išvesti įvesto skaičiaus skaitmenų sumą. Programa turi paprašyti
        //vartotojo įvesti skaičių ir tada apskaičiuoti bei išvesti skaitmenų sumą. Pvz., jei vartotojas įveda 123, programa turėtų išvesti 6 (1+2+3)

        System.out.println("Įveskite skaičių");
        String skaicius = Custom.nuskaitytiStringVerteCon();
        int suma = 0;
        String atsakymas = ")";
        while(skaicius.length()>=1){
            int skaitmuo = Integer.parseInt(skaicius.substring(skaicius.length()-1,skaicius.length()));
            suma+=skaitmuo;
            skaicius = skaicius.substring(0,skaicius.length()-1);
            if(skaicius.length()<1){
                atsakymas += skaitmuo;
                continue;
            }
            atsakymas += skaitmuo + "+";
        }
        atsakymas +="(";
        StringBuilder stringBuilder = new StringBuilder(atsakymas);
        stringBuilder.reverse();

        System.out.println(suma + stringBuilder.toString());

        // Užduotis: Sukurkite klasę Studentas, kuri turėtų laukus vardas, pavarde ir sąrašą pažymių.
        // Parašykite metodą, kuris apskaičiuotų vidutinį pažymį. Tada parašykite funkciją, kuri
        // sugeneruos n studentų su atsitiktiniais pažymiais ir atspausdins visų studentų vardus,
        // pavardes ir jų vidurkius. Studentus sugeneruoti reikia random is vardu masyvo elementų ir
        // pavardžių masyvo elementų


        System.out.println("Kiek studentų generuoti?");
        int studentuKiekis = Custom.nuskaitytiIntVerteCon();
        System.out.println("Kiek studentai turės pažymių?");
        int pazymiuKiekis  = Custom.nuskaitytiIntVerteCon();
        String[] vardai = new String[]{     "Olivia", "Ella", "Alexander", "Sophia", "Jackson", "Elijah", "Lucas", "Emma", "Noah", "James",
                                            "Henry", "Liam", "Harper", "Evelyn", "Mia", "Isabella", "Ethan", "Ava", "Amelia", "Mason"};
        String[] pavardes = new String[]{   "Wilson", "Smith", "Jackson", "Taylor", "Martin", "Hernandez", "Davis", "Johnson", "Anderson",
                                            "Moore", "Williams", "Jones", "Garcia", "Thomas", "Rodriguez", "Martinez", "Brown", "Miller", "Lopez", "Gonzalez"};
        Random random = new Random();
        List<Studentas> studentuListas = new ArrayList<>();
        for(int i = 0; i < studentuKiekis; i++){
            studentuListas.add(new Studentas(   vardai[random.nextInt(0, vardai.length)],
                                                pavardes[random.nextInt(0, vardai.length)],
                                                pazymiuKiekis));
        }

        for(Studentas s:studentuListas){
            System.out.println(s);
        }

        // Užduotis: Sukurkite klasę Darbuotojas, kuri turėtų laukus vardas, pavarde, atlyginimas. Parašykite metodą, kuris
        // padidins atlyginimą tam tikru procentu. Sukurkite sąrašą darbuotojų ir parašykite funkciją, kuri padidins atlyginimus
        // visiems darbuotojams ir atspausdins jų informaciją.


        System.out.println("Kiek darbuotojų generuoti?");
        int darbuotojuKiekis = Custom.nuskaitytiIntVerteCon();
        System.out.println("Kiek didinti atlyginimą (procento dalis, pvz 0.25)?");
        double procentas  = Custom.nuskaitytiDoubleVerteCon();

        List<Darbuotojas> darbuotjuListas = new ArrayList<>();
        for(int i = 0; i < darbuotojuKiekis; i++){
            darbuotjuListas.add(new Darbuotojas(    vardai[random.nextInt(0, vardai.length)],
                                                    pavardes[random.nextInt(0, vardai.length)],
                                                    new BigDecimal(random.nextInt(1000,5000))));
        }

        for(Darbuotojas d:darbuotjuListas){
            d.padidintiAtlyginima(new BigDecimal(procentas));
            System.out.println(d);
        }

        // Užduotis: Sukurkite programą, kuri atliks šias operacijas su matrica ir vektoriais:
        //Sukurkite klasę Matrica, kuri turės dvimatį masyvą ir metodus:
        //IsvestiMatrica - išvesti matricą į konsolę.
        //Transponuoti - grąžina transponuotą matricą.
        //Sudeti - sudeda dvi matricas.
        //Dauginti - daugina matricą iš vektoriaus.
        //Sukurkite klasę Vektorius, kuri turės vienmatį masyvą ir metodą:
        //IsvestiVektorius - išvesti vektorių į konsolę.


        System.out.println("Parasykite kokio dydzio matrica sugeneruoti");

        System.out.println("Įveskite matricos dydi");
        int mDydis = Custom.nuskaitytiIntVerteCon();
        Matrica m1= new Matrica();
        Matrica m2= new Matrica();

        System.out.println("Pirma matrica");
        m1.sugeneruotiMatrica(mDydis);
        System.out.println(m1);

        System.out.println("Antra matrica");
        m2.sugeneruotiMatrica(mDydis);
        System.out.println(m2);


        System.out.println("Transponuota pirma matrica:");
        m1.transponavimas();
        System.out.println(m1);

        System.out.println("Sudetos m1 (trasponuota) ir m2 matricos");
        System.out.println(Matrica.sudeti(m1,m2));

        Vektorius vektorius = new Vektorius();
        vektorius.sugeneruotiVektoriu(mDydis);

        System.out.println("Vektorius:");
        System.out.println(vektorius);

        System.out.println("Pirma matrica m1");
        System.out.println(m1);

        System.out.println("Vektoriaus ir matrica m1 daugyba:");

        Vektorius saugaugintasVektorius = Vektorius.daugintiIsMatricos(m1,vektorius);
        System.out.println("Sudaugintas vektorius:");
        System.out.println(saugaugintasVektorius);



    }
}