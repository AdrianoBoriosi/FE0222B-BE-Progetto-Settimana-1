package Macchina;

public class Macchina {

    private String nome;
    private int cilindrata;
    private String targa;
    private double prezzo;
    private String colore;
    private int numeroMarce;
    private boolean motoreAcceso = false;
    private int marcia = 0;


    public Macchina(String nome, int cilindrata, String targa, double prezzo, String colore, int numeroMarce) {
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.prezzo = prezzo;
        this.colore = colore;
        this.numeroMarce = numeroMarce;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getNumeroMarce() {
        return numeroMarce;
    }

    public void setNumeroMarce(int numeroMarce) {
        this.numeroMarce = numeroMarce;
    }

    public boolean isMotoreAcceso() {
        return motoreAcceso;
    }

    public void setMotoreAcceso(boolean motoreAcceso) {
        this.motoreAcceso = motoreAcceso;
    }

    public int getMarcia() {
        return marcia;
    }

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    public void accendiMotore() {
        setMotoreAcceso(true);
    }

    public void spegniMotore() {
        setMotoreAcceso(false);
        setMarcia(0);
    }



    public void scalaMarcia(){
        if (getMarcia() < 1){
            throw new RuntimeException("Marcia non valida");
        } else {
            setMarcia(getMarcia()-1);
        }
        System.out.println();
    }

    public void aumentaMarcia() {
        if (getMarcia() == getNumeroMarce()) {
            throw new RuntimeException("Impossibile aumentare la marcia");
        } else {
            setMarcia(getMarcia() + 1);
        }
    }
    public char[] stampaInformazioni() {
        System.out.println("nome: " + getNome() + " cilindrata: " + getCilindrata() + " targa: " + getTarga() + " prezzo: " + getPrezzo() + " colore: " + getColore() + " numero di marce: " + getNumeroMarce());
        return new char[0];
    }
}