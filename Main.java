import Macchina.Macchina;

public class Main {

    public static void main(String[] args) {
        Macchina[] arrayMacchina = new Macchina[5];

        arrayMacchina[0] = new Macchina("Chevrolet", 900, "AX939KJ", 7.000, "Nero", 5);
        arrayMacchina[1] = new Macchina("Fiat", 1000, "CB767HU", 10.000, "Bianco", 5);
        arrayMacchina[2] = new Macchina("Alfa Romeo", 1800, "EF020LO", 18.000, "Rosso", 6);
        arrayMacchina[3] = new Macchina("Ford", 1200, "BC212SX", 12.000, "Blu", 5);
        arrayMacchina[4] = new Macchina("Opel", 1700, "FE090MB", 15.000, "Verde", 6);

        Macchina macchina1 = arrayMacchina[0];
        Macchina macchina2 = arrayMacchina[1];
        Macchina macchina3 = arrayMacchina[2];
        Macchina macchina4 = arrayMacchina[3];
        Macchina macchina5 = arrayMacchina[4];


        stampaMacchine(arrayMacchina);
        stampaMacchinaTarga(arrayMacchina);
        stampaMacchinaColore(arrayMacchina);
        selezionaMacchinaPrezzoPiuAlto(arrayMacchina);
        infoMacchina("EF020LO", arrayMacchina);
        infoMacchinaColore("Verde", arrayMacchina);
    }

    static void stampaMacchine(Macchina[] arrayMacchina) {
        for (int i = 0; i < arrayMacchina.length; i++) {
            System.out.println("Stampa di prova macchina: " + i);
            System.out.println(arrayMacchina[i].stampaInformazioni());
        }

    }

    static void stampaMacchinaTarga(Macchina[] arrayMacchina) {
        for (int i = 0; i < arrayMacchina.length; i++) {
            System.out.println("Stampa solo targa macchina: " + i);
            System.out.println(arrayMacchina[i].getTarga());
        }

    }

    static void stampaMacchinaColore(Macchina[] arrayMacchina) {
        for (int i = 0; i < arrayMacchina.length; i++) {
            System.out.println("Stampa solo colore macchina: " + i);
            System.out.println(arrayMacchina[i].getColore());
        }

    }

    static void selezionaMacchinaPrezzoPiuAlto(Macchina[] arrayMacchina) {
        double max = 15.000;
        for (int i = 0; i < arrayMacchina.length; i++) {
            if (arrayMacchina[i].getPrezzo() > max) {
                max = arrayMacchina[i].getPrezzo();
                System.out.println("La macchina più costosa ha un valore di: " + max);
            }
        }

    }


    static void infoMacchina(String targa, Macchina[] arrayMacchina) {
        Macchina targaMacchina = null;
        for (int i = 0; i < arrayMacchina.length; i++) {
            if (targa.equals(arrayMacchina[i].getTarga())) {
                targaMacchina = arrayMacchina[i];
            }
        }
        if (targaMacchina == null) {
            throw new RuntimeException("Non hai inserito una targa esistente.");
        } else {
            System.out.println("La targa" + " " + targa + " " + "corrisponde alla macchina: " + targaMacchina.getNome());
        }
    }


    static void infoMacchinaColore(String colore, Macchina[] arrayMacchina) {
        Macchina coloreMacchina = null;
        for (int i = 0; i < arrayMacchina.length; i++) {
            if (colore.equals(arrayMacchina[i].getColore())) {
                coloreMacchina = arrayMacchina[i];
            }
        }
        if (coloreMacchina == null) {
            throw new RuntimeException("Non hai inserito un colore presente.");
        } else {
            System.out.println("La macchina di colore" + " " + colore + " " + "corrisponde a: " + coloreMacchina.getNome());
        }
    }


}