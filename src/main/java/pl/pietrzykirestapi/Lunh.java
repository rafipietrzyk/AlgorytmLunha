package pl.pietrzykirestapi;

import java.util.Scanner;

public class Lunh {

    public static boolean czyPoprawna(String liczba) {
        // zmienne przechowujące odpowiednie sumy
        int sumaParzystych = 0, sumaNieparzystych = 0;

        // odwracamy liczbę dla uproszczenia obliczeń
        String odwroconaLiczba = new StringBuilder(liczba).reverse().toString();

        // pętla dla poszczególnych cyfr
        for (int i = 0; i < odwroconaLiczba.length(); i++) {

            // zamieniamy znak cyfry na wartość liczbową
            int cyfra = Integer.parseInt(odwroconaLiczba.substring(i, i + 1));

            // cyfra na pozycji nieparzystej
            if (i % 2 == 0) {
                // zwiększamy sumę
                sumaNieparzystych += cyfra;
            }
            // cyfra na pozycji parzystej
            else {
                // podwajamy cyfrę
                cyfra = cyfra * 2;

                // jeśli wynik większy od 9 to sumujemy cyfry wyniku
                if (cyfra > 9) cyfra = (cyfra % 10) + 1;

                // zwiększamy sumę
                sumaParzystych += cyfra;
            }
        }
        // zwracamy prawdę lub fałsz w zależności od wyniku modulo 10
        return (sumaParzystych + sumaNieparzystych) % 10 == 0;
    }

    public static void main(String[] args) {
        String liczba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj numer do sprawdzenia");
        liczba = sc.nextLine();

        if (czyPoprawna(liczba)) {
            System.out.println("Numer jest prawidłowy");
        } else {
            System.out.println("Numer jest nieprawidłowy");
        }
    }
}
