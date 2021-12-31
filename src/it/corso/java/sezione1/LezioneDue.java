package it.corso.java.sezione1;

/**
 *  INDICE DELLA LEZIONE
 *
 *  1. COME FUNZIONA LA CLASSE STRING
 *  2. METODI DI MANIPOLAZIONE DELLA CLASSE STRING
 */

// TODO: 31/12/2021 Riscrivere commenti seguendo la sintassi HTML 

public class LezioneDue {

    /**
     *  [*** COME FUNZIONA LA CLASSE STRING ***]
     *
     *  Una stringa è una sequenza di caratteri (lettere, numeri, apici, apostrofi, caratteri speciali, ecc..).
     *
     *  In Java le stringhe si rappresentano con l'oggetto STRING che si trova nel package java.lang. Java non ammette
     *  le stringhe come tipo primitivo.
     *
     *  In particolare, in Java, una stringa è una sequenza finita di caratteri racchiusa tra virgolette.
     *
     *  [String] [nomeVariabile] = "[contenutoStringa]"
     *
     *  La classe String è immutabile, cioè lo stato di un'istanza di quella classe non può essere modificato dopo che
     *  è stato creato, pertanto, la classe String NON È EREDITABILE.
     *
     *  i.e. [public class MiaClasseString extend String] NON È AMMESSO.
     */

    public static void main(String[] args){

        System.out.println("Benvenuto al Corso Java!\n@version: 1.0.0\n@author: AC ");
    }

}
