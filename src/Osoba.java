public abstract class Osoba {
    //z klasy abstrakcyjnej nie można utworzyć obiektu tej klasy
    public String imie; //dostępne wszędzie
    private int wiek; //hermetyzacja, dostęp tylko w klasie
    //protected w tej klasie i klasach potomnych (tylko w javie w ramach pakietu)
    //brak modyfikatora dostępu - dostęp w pakiecie

    //przeciążanie konstruktorów
    public Osoba() {
        imie="";
        wiek=0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    //metody dostępowe getter i setter
    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0||wiek>110){
            this.wiek=0;
        }else{
            this.wiek = wiek;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
