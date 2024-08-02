package io.Petrov_Todor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class Editoria {
    private static final Logger loger = LoggerFactory.getLogger(Editoria.class);
    String autore;
    String genere;

    //ATTRIBUTI
    public Editoria(String autore, String genere) {
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Editoria{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
