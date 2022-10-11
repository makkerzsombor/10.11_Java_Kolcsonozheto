package hu.petrik.kolcsonzoOOP;

public class Dvd implements Kolcsonozheto, Comparable<Dvd>{
    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s (%d perc)", this.cim, this.hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }

    @Override
    public int compareTo(Dvd masik) {
        return this.hossz - masik.hossz;
    }
}
