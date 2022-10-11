package hu.petrik.kolcsonzoOOP;

public class Ujsag implements Kolcsonozheto{
    private String cim;
    private int kiadasEve;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEve, int kiadasHet) {
        this.cim = cim;
        this.kiadasEve = kiadasEve;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s %d/%d.",this.cim, this.kiadasEve, this.kiadasHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
