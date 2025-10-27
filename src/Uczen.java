public class Uczen extends Osoba implements Dyzurny{
    //uczeń jest klasą potomną klasy bazowej Osoba
    //dziedziczenie
    private int nrUcznia;
    private static int liczbaUczniow;
    //static - pole klasy a nie obiektu


    public Uczen() {
        liczbaUczniow++;
        nrUcznia=liczbaUczniow;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nrUcznia=liczbaUczniow;
    }

    public Uczen(String imie, int wiek, int nrUcznia) {
        super(imie, wiek); //wywołanie konstruktora klasy bazowej

        liczbaUczniow++;
        this.nrUcznia = nrUcznia;
    }



    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen: " +
                "nrUcznia=" + nrUcznia +
                ", imie='" + imie +
                " ,wiek = "+getWiek();
    }

    @Override
    public void wykonaDyzur() {
        System.out.println("Czysta tablica");
    }
}
