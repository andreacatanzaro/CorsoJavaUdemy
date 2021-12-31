package it.corso.java.sezione1;

/**
 *  INDICE DELLA LEZIONE
 *
 *  1. COSA SONO LE VARIABILI
 *  2. DICHIARAZIONE E INIZIALIZZAZIONE DELLE VARIABILI
 *  3. TIPI DI DATO
 */

// TODO: 31/12/2021 Riscrivere commenti seguendo la sintassi HTML 

public class LezioneUno {
    /**
     *  [*** COSA SONO LE VARIABILI ***]
     *
     *  Una variabile è una porzione di memoria al cui interno viene salvato un dato.
     *
     *  Il nome della variabile rappresenta l'indirizzo fisico in memoria. Serve per identificare la locazione della
     *  variabile in memoria al fine di accedere o modificare il valore durante la sua esecuzione.
     *
     *  [*** TIPI DI VARIABILI ***]
     *
     *  Una variabile assume un preciso significato in base al punto di codice in cui viene definita. In Java ci sono
     *  i seguenti tipi di variabili:
     *
     *      [VARIABILI LOCALI]
     *      sono definite all'interno di un metodo. Sono create quando un metodo viene chiamato cancellate dalla memoria
     *      quando il metodo termina.
     *
     *      [VARIABILI DI ISTANZA]
     *      sono definite all'interno di una classe, ma fuori dai metodi della classe stessa (altrimenti diventano
     *      variabili locali)
     *
     *      [VARIABILI DI CLASSE]
     *      sono variabili di istanza ma nella loro definizione viene usato il modificatore "static"
     *
     *      [PARAMETRI]
     *      vengono dichiarati all'interno delle parentesi tonde di un determinato metodo.
     *
     *  [*** DICHIARAZIONE E INIZIALIZZAZIONE DELLE VARIABILI ***]
     *
     *  Una variabile, per essere utilizzata, deve essere dichiarata e inizializzata. Una variabile può essere usata
     *  solo dopo l'inizializzazione (che deve essere necessariamente preceduta dalla dichiarazione).
     *
     *      [DICHIARAZIONE]
     *      La dichiarazione serve per allocare in memoria la variabile. Lo spazio in memoria occupato varia in funzione
     *      del tipo di dato. La variabile in fase di dichiarazione sarà senza valore.
     *
     *      [tipoVariabile] [nomeVariabile]; --> int taxRate;
     *
     *      [INIZIALIZZAZIONE]
     *      L'inizializzazione è l'operazione che consente di assegnare un valore ad una variabile dichiarata. Il valore
     *      assegnato viene scritto nella memoria allocata in precedenza, durante la fase di dichiarazione.
     *
     *      [nomeVariabile] = [valore]; --> taxRate = 3;
     *
     *      [DICHIARAZIONE + INIZIALIZZAZIONE]
     *      In Java è possibile effettuare le operazioni di DICHIARAZIONE ed INIZIALIZZAZIONE contestuamente, come viene
     *      riportato di seguito (e come verrà più volte utilizzato durante tutto il corso)
     *
     *      [tipoVariabile] [nomeVariabile] = [valore]; --> int taxRate = 3;
     */

    private static void metodoTest(){

        /**
         *  Poiché metodoTest è un "Metodo", le variabili definite al suo interno sono VARIABILI LOCALI. Infatti, sia
         *  la variabile name, che la variabile surname, vengono cancellate al termine dell'esecuzione di tale metodo.
         */

        String name = "Andrea";
        String surname = "Catanzaro";
    }

    /**
     *  Poiché variabileDiIstanza è definita all'interno di una classe, ma fuori da qualsiasi altro metodo appartenente
     *  alla classe stessa, questa sarà una VARIABILE DI ISTANZA. Inoltre, non avendo il modificatore "static", questa
     *  non può essere considerata una VARIABILE DI CLASSE.
     */

    private String variabileDiIstanza = "Questa è una variabile di istanza";

    /**
     *  Poiché variabileDiClasse è definita all'interno della classe, contiene il modificatore "static" e non è definita
     *  all'interno di un metodo, questa sarà una VARIABILE DI CLASSE.
     */

    private static String variabileDiClasse = "Questa è una variabile di classe";

    public static void main(String[] args){

        /**
         *  Il termine "args" in questo caso è un parametro che viene passato al metodo "main".
         */

        System.out.println("Benvenuto al Corso Java!\n@version: 1.0.0\n@author: AC ");

        /**
         *  [*** TIPI DI DATO ***]
         *
         *  In Java esistono due tipi di dato:
         *
         *      [TIPI PRIMITIVI]
         *      Sono 8 (boolean, byte, char, double, float, int, long, short) ed utilizzano una quantità di memoria
         *      definita. Ogni tipo primitivo ha un valore di default.
         *
         *          BOOLEAN
         *              Cosa rappresenta: valori VERO o FALSO (True o False)
         *              Memoria utilizzata: non specificato (sarebbe sufficiente un solo bit)
         *              Valore di default: False
         *
         *          BYTE
         *              Cosa rappresenta: valori interi compresi tra -128 e 127 (inclusi). Questo tipo di dato viene
         *                                usato per risparmiare memoria in Array di grandi dimensioni, poiché una var
         *                                BYTE è 4 volte più piccola di una variabile INT. Sui BYTE le operazioni di
         *                                tipo aritmetico (+, -, *, /) NON SONO AMMESSE.
         *              Memoria utilizzata: 8 bit
         *              Valore di default: 0
         *
         *          CHAR
         *              Cosa rappresenta: è un carattere UNICODE (sistema di codifica che assegna un numero univoco a
         *                                ogni carattere utilizzato per la scrittura di testi). Il valore più piccolo è
         *                                \u0000 (ovvero 0), il più grande è \uffff (ovvero 65535).
         *              Memoria utilizzata: 16 bit
         *              Valore di default: \u0000 (ovvero 0)
         *
         *          DOUBLE
         *              Cosa rappresenta: numeri in virgola mobile (cioè numeri reali) con precisione doppia secondo la
         *                                specifica IEEE 745. La precisione con cui sono rappresentati i numeri è più
         *                                alta del FLOAT perche sono utilizzati 64 bit al posto di 32 bit. Il più grande
         *                                DOUBLE positivo è 1.79769313486231570e+308, mentre il più piccolo positivo
         *                                non-zero è 4.94065645841246544e-324. Quando si lavora con numeri decimali è
         *                                consigliato utilizzare questo tipo di dato rispetto al tipo FLOAT. Anche il
         *                                DOUBLE non dovrebbe essere utilizzato per valori precisi, i.e. Le valute.
         *              Memoria utilizzata: 64 bit
         *              Valore di default: 0.0d (ovvero 0 DOUBLE)
         *
         *          FLOAT
         *              Cosa rappresenta: numeri in virgola mobile (cioè numeri reali) con precisione singola secondo la
         *                                specifica IEEE 754. Il più grande float positivo è 3.40282347e+38f, mentre il
         *                                più piccolo positivo non-zero è 1.40239846e-45f.
         *                                Questo tipo di dato non dovrebbe essere utilizzato per valori precisi, ad
         *                                esempio le valute (in questi casi esistono la classe java.math.BigDecimal)
         *              Memoria utilizzata: 32 bit
         *              Valore di default: 0.0f (ovvero 0 FLOAT)
         *
         *          INT
         *              Cosa rappresenta: valori interi compresi tra -2.147.483.648 e 2.147.483.647 (inclusi). È il
         *                                tipo di dato utilizzato per i valori interi (tranne in caso di problemi di
         *                                disponibilità di memoria).
         *                                Sui tipi int le operazioni aritmetiche (+ - * /) SONO AMMESSE.
         *              Memoria utilizzata: 32 bit
         *              Valore di default: 0
         *
         *          LONG
         *              Cosa rappresenta: valori interi compresi tra -9.223.372.036.854.775.808 e 9.223.372.036.854.775.
         *                                807 (inclusi). È il tipo di dato utilizzato quando si lavora con interi di
         *                                grandi dimensioni.
         *                                Sui long int le operazioni aritmetiche (+ - * /) SONO AMMESSE.
         *              Memoria utilizzata: 64 bit
         *              Valore di default: 0L (ovvero 0 LONG)
         *
         *          SHORT
         *              Cosa rappresenta: valori interi compresi tra -32768 e 32767 (inclusi). Come il byte, questo tipo
         *                                di dato può essere usato per risparmiare memoria in array di grandi dimensioni
         *                                poiché una variabile short è due volte più piccola di una int.
         *                                Sui tipi short le operazioni aritmetiche (+ - * /) NON SONO AMMESSE.
         *              Memoria utilizzata: 16 bit
         *              Valore di default: 0
         *
         *      [TIPI DI RIFERIMENTO]
         *      Possono essere diversi (classi, interfacce, ...) e utilizzano una quantità di memoria variabile in
         *      funzione del numero di informazioni contenute (ad esempio un oggetto di tipo Indirizzo occupa memoria
         *      in base alle informazioni VIA, CAP, CITTA, ...). Ogni variabile di questo tipo viene inizializzata per
         *      default con il valore speciale NULL.
         *
         */

        boolean variabileBoolean = true;
            // variabile di tipo BOOLEAN (true o false)

        byte variabileByte = 127;
            // variabile di tipo BYTE (non sono ammesse operazioni aritmetiche)

        char variabileChar = 'A';
            // variabile di tipo CHAR (unico carattere entro singoli apici)

        double variabileDouble = -45.3;
            // variabile di tipo DOUBLE (non è necessaria la "d" finale)

        float variabileFloat = 45.3F;
            // variabile di tipo FLOAT (è necessaria la "F" finale)

        int variabileInteger = 6000;
            // variabile di tipo INT

        long variabileLong = 34L;
            // variabile di tipo LONG (è necessaria la "L" finale)

        short variabileShort = 4562;
            // variabile di tipo SHORT

    }
}
