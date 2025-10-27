import java.util.ArrayList;

public class Klasa {
    private Wychowawca wychowawca;
    private ArrayList<Uczen> uczniowie;
    private String nazwaKlasy;
    //myślimy coi ta klasa powinna wiedzieć


    public Klasa(Wychowawca wychowawca, ArrayList<Uczen> uczniowie, String nazwaKlasy) {
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;
        this.nazwaKlasy = nazwaKlasy;
    }

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowie = new ArrayList<>();
    }
}
