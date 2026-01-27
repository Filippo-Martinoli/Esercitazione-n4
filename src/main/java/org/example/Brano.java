package org.example;

public class Brano {
    private String idBrano;
    private String titolo;
    private String durata;
    private String DataPubblicazione;
    private int numeroAscolti;
    private int numeroLike;

    public Brano(String idBrano, String titolo, String durata, String dataPubblicazione, int numeroAscolti, int numeroLike) {
        this.idBrano = idBrano;
        this.titolo = titolo;
        this.durata = durata;
        DataPubblicazione = dataPubblicazione;
        this.numeroAscolti = numeroAscolti;
        this.numeroLike = numeroLike;
    }

    public String getIdBrano() {
        return idBrano;
    }

    public void setIdBrano(String idBrano) {
        this.idBrano = idBrano;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getDataPubblicazione() {
        return DataPubblicazione;
    }

    public void setDataPubblicazione(String dataPubblicazione) {
        DataPubblicazione = dataPubblicazione;
    }

    public int getNumeroAscolti() {
        return numeroAscolti;
    }

    public void setNumeroAscolti(int numeroAscolti) {
        this.numeroAscolti = numeroAscolti;
    }

    public int getNumeroLike() {
        return numeroLike;
    }

    public void setNumeroLike(int numeroLike) {
        this.numeroLike = numeroLike;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "idBrano='" + idBrano + '\'' +
                ", titolo='" + titolo + '\'' +
                ", durata='" + durata + '\'' +
                ", DataPubblicazione='" + DataPubblicazione + '\'' +
                ", numeroAscolti=" + numeroAscolti +
                ", numeroLike=" + numeroLike +
                '}';
    }
}

