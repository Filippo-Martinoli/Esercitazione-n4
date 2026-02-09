package org.example;

public class Brano {
    private String idBrano;
    private String titolo;
    private String cantante;
    private String durata;
    private int annoPubblicazione;
    private int numeroAscolti;
    private int numeroLike;

    public Brano(String idBrano, String titolo, String cantante,
                 String durata, int annoPubblicazione,
                 long numeroAscolti, int numeroLike) {

        this.idBrano = idBrano;
        this.titolo = titolo;
        this.cantante = cantante;
        this.durata = durata;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroAscolti = numeroAscolti;
        this.numeroLike = numeroLike;
    }

    public String getIdBrano() {
        return idBrano;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCantante() {
        return cantante;
    }

    public String getDurata() {
        return durata;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroAscolti() {
        return numeroAscolti;
    }

    public int getNumeroLike() {
        return numeroLike;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "idBrano='" + idBrano + '\'' +
                ", titolo='" + titolo + '\'' +
                ", cantante='" + cantante + '\'' +
                ", durata='" + durata + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroAscolti=" + numeroAscolti +
                ", numeroLike=" + numeroLike +
                '}';
    }
}
