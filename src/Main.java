public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Uczen();
        System.out.println(osoba.imie);
        osoba.imie="Jaś";
        System.out.println(osoba.imie);

        osoba.setWiek(12);
        System.out.println("Wiek: "+osoba.getWiek());
        System.out.println(osoba);

        System.out.println("Liczba uczniów: "+ Uczen.getLiczbaUczniow());
        Uczen uczen = new Uczen("Jadwiga", 16, 123);
        Uczen uczen2 = new Uczen("Janusz", 17, 1234);
        System.out.println("Liczba uczniów: "+ Uczen.getLiczbaUczniow());
        System.out.println(uczen);
        System.out.println(uczen2);
    }
}