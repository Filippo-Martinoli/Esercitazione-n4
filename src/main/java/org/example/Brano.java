package org.example;

public class Brano {
    private String idBrano;
    private String titolo;
    private String durata;
    private String DataPubblicazione;

    public Brano(String idBrano, String dataPubblicazione, String durata, String titolo) {
        this.idBrano = idBrano;
        DataPubblicazione = dataPubblicazione;
        this.durata = durata;
        this.titolo = titolo;
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
}