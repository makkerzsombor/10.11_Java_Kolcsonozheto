package hu.petrik.kolcsonzoOOP;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Kolcsonozheto> katalogus = new ArrayList<>();
    static ArrayList<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("A Gyűrűk Ura","J.R.R","AABBCC-121314");
        Dvd dvd1 = new Dvd("Star Wars V.rész ",124);
        Dvd dvd2 = new Dvd("Star Wars IV.rész ",121);
        Dvd dvd3 = new Dvd("Star Wars VI.rész ",131);
        Dvd dvd4 = new Dvd("Gyűrűk Ura - Gyűrű Szövetsége ",201);
        Dvd dvd5 = new Dvd("Gyűrűk Ura - Király visszatér ",180);
        Dvd dvd6 = new Dvd("Gyűrűk Ura - A két torony ",179);
        Ujsag ujsag1 = new Ujsag("Képes Sport",2007,23);

        // Interface típusó objektum csak úgy hozható létre, ha az megvalosítja az interface minden függvényét
        Kolcsonozheto kolcsonozheto = new Kolcsonozheto() {
            @Override
            public String megjelenitheto() {
                return null;
            }

            @Override
            public int meddigKolcsonozheto() {
                return 0;
            }
        };

        System.out.println(konyv1.getIsbn());
        System.out.println(konyv1.megjelenitheto());
        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        for (Kolcsonozheto k: katalogus){
            System.out.println(k.megjelenitheto()+" "+k.meddigKolcsonozheto());
        }

        System.out.println();
        System.out.println("Rendezés előtt:");
        for (Dvd d:dvdk){
            System.out.println(d.megjelenitheto()+" "+d.meddigKolcsonozheto());
        }

        System.out.println();
        System.out.println("Rendezés után:");
        Collections.sort(dvdk);
        for (Dvd d: dvdk){
            System.out.println(d.megjelenitheto()+" "+d.meddigKolcsonozheto());
        }

    }
}
