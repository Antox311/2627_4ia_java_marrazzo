
public class SimulaMath { // Creiamo la classe SimulaMath

    private double valore; // Attributo che contiene un numero

    public SimulaMath() { // Costruttore senza parametri
    }

    public SimulaMath(double valore) { // Costruttore parametrizzato
        this.valore = valore; // Assegna il valore ricevuto all'attributo
    }

    // POTENZA
    public double potenza(double x, double y) { // Metodo che calcola la potenza
        double risultato = 1; // Variabile che contiene il risultato

        for (int i = 0; i < y; i++) { // Ripete il ciclo y volte
            risultato = risultato * x; // Moltiplica il risultato per x
        }

        return risultato; // Restituisce il risultato
    }

    // RADICE QUADRATA
    public double radiceQuadrata() { // Metodo che calcola la radice
        double risultato = 0; // Parte da zero

        while (risultato * risultato < valore) { // Controlla se il quadrato è minore del valore
            risultato = risultato + 0.0001; // Aumenta il risultato poco alla volta
        }

        return risultato; // Restituisce la radice trovata
    }

    // SENO
    public double seno() { // Metodo che calcola il seno
        double risultato = 0; // Inizializza il risultato
        double termine = valore; // Primo termine della formula

        for (int i = 1; i <= 10; i++) { // Ripete il calcolo 10 volte
            risultato = risultato + termine; // Aggiunge il termine al risultato
            termine = -termine * valore * valore / ((2 * i) * (2 * i + 1)); // Calcola il termine successivo
        }

        return risultato; // Restituisce il seno
    }

    // COSENO
    public double coseno() { // Metodo che calcola il coseno
        double risultato = 0; // Inizializza il risultato
        double termine = 1; // Primo termine della formula

        for (int i = 1; i <= 10; i++) { // Ripete il calcolo 10 volte
            risultato = risultato + termine; // Aggiunge il termine al risultato
            termine = -termine * valore * valore / ((2 * i - 1) * (2 * i)); // Calcola il termine successivo
        }

        return risultato; // Restituisce il coseno
    }

    // TANGENTE
    public double tangente() { // Metodo che calcola la tangente
        return seno() / coseno(); // Divide il seno per il coseno
    }

    // LOGARITMO
    public double log() { // Metodo che calcola il logaritmo
        double x = valore; // Copia il valore dell'attributo
        double risultato = 0; // Inizializza il risultato

        while (x >= 2) { // Ripete finché x è maggiore o uguale a 2
            x = x / 2; // Divide x per 2
            risultato = risultato + 0.693147; // Aggiunge un valore al risultato
        }

        return risultato; // Restituisce il risultato
    }

    // ESPONENZIALE
    public double esponenziale() { // Metodo che calcola l'esponenziale
        double risultato = 1; // Inizializza il risultato
        double termine = 1; // Inizializza il termine

        for (int i = 1; i <= 10; i++) { // Ripete il calcolo 10 volte
            termine = termine * valore / i; // Calcola il termine successivo
            risultato = risultato + termine; // Aggiunge il termine al risultato
        }

        return risultato; // Restituisce il risultato
    }

    // VALORE ASSOLUTO
    public double valoreAssoluto() { // Metodo che calcola il valore assoluto
        if (valore < 0) { // Controlla se il numero è negativo
            return -valore; // Restituisce il numero positivo
        } else { // Altrimenti
            return valore; // Restituisce il numero senza modificarlo
        }
    }

    // FLOOR
    public double floor() { // Metodo che restituisce la parte intera
        return (int) valore; // Trasforma il numero in intero
    }

    // ROUND
    public double round() { // Metodo che arrotonda il numero
        return (int) (valore + 0.5); // Aggiunge 0.5 e trasforma in intero
    }

    // MAIN
    public static void main(String[] args) { // Metodo principale del programma

        SimulaMath m = new SimulaMath(5); // Creiamo un oggetto con valore 5

        System.out.println("Potenza: " + m.potenza(2, 3)); // Calcola 2 elevato alla 3

        SimulaMath radice = new SimulaMath(9); // Creiamo un oggetto con valore 9
        System.out.println("Radice quadrata: " + radice.radiceQuadrata()); // Calcola la radice di 9

        SimulaMath seno = new SimulaMath(1); // Creiamo un oggetto con valore 1
        System.out.println("Seno: " + seno.seno()); // Calcola il seno di 1 radiante

        System.out.println("Coseno: " + seno.coseno()); // Calcola il coseno di 1 radiante

        System.out.println("Tangente: " + seno.tangente()); // Calcola la tangente di 1 radiante

        SimulaMath log = new SimulaMath(2); // Creiamo un oggetto con valore 2
        System.out.println("Logaritmo: " + log.log()); // Calcola il logaritmo di 2

        SimulaMath esp = new SimulaMath(2); // Creiamo un oggetto con valore 2
        System.out.println("Esponenziale: " + esp.esponenziale()); // Calcola l'esponenziale di 2

        System.out.println("Valore assoluto: " + m.valoreAssoluto()); // Calcola il valore assoluto di 5

        System.out.println("Floor: " + new SimulaMath(4.8).floor()); // Restituisce la parte intera di 4.8

        System.out.println("Round: " + new SimulaMath(4.8).round()); // Arrotonda 4.8 a 5

    } // Fine del metodo main

} // Fine della classe

