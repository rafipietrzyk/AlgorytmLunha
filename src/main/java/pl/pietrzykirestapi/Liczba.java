package pl.pietrzykirestapi;

public class Liczba {
    String liczba;

    public Liczba(String liczba) {
        this.liczba = liczba;
    }

    public String getLiczba() {
        return liczba;
    }

    public void setLiczba(String liczba) {
        this.liczba = liczba;
    }

    @Override
    public String toString() {
        return "Liczba{" +
                "liczba='" + liczba + '\'' +
                '}';
    }
}
