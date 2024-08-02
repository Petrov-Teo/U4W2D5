package io.Petrov_Todor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        List<Libri_Collection> libriList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Inserisci l'autore: ");
            String autore = scanner.nextLine();

            System.out.print("Inserisci il genere: ");
            String genere = scanner.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            System.out.print("Inserisci l'anno di pubblicazione: ");
            int annoDiPubblicazione = scanner.nextInt();

            System.out.print("Inserisci il numero di pagine: ");
            int numeroPagine = scanner.nextInt();
            scanner.nextLine();

            Libri_Collection libro = new Libri_Collection(autore, genere, titolo, annoDiPubblicazione, numeroPagine);
            libriList.add(libro);
            System.out.println("Il libro è stato creato: " + libro);

            System.out.print("Vuoi inserire un altro libro? (s/n): ");
            String risposta = scanner.nextLine();
            if (!risposta.equalsIgnoreCase("s")) {
                continueInput = false;
            }
        }

       
        System.out.println("Lista dei libri memorizzati:");
        for (Libri_Collection libro : libriList) {
            System.out.println(libro);
        }

        scanner.close();
        System.out.println(libriList);
    }
}