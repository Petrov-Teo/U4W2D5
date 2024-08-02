package io.Petrov_Todor;

import java.util.Random;

public class Libri_Collection extends Editoria {

    int codiceSbn;
    String titolo;
    int annoDiPubblicazione;
    int numeroPagine;

    public Libri_Collection(String autore, String genere, String titolo, int annoDiPubblicazione, int numeroPagine) {
        super(autore, genere);
        Random random = new Random();
        this.codiceSbn = random.nextInt(10000000, 90000000);
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
        
    }

    public int getCodiceSbn() {
        return codiceSbn;
    }

    public void setCodiceSbn(int codiceSbn) {
        this.codiceSbn = codiceSbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Libri_Collection{" +
                "codiceSbn=" + codiceSbn +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
