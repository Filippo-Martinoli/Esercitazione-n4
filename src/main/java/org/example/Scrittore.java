package org.example;
import java.util.List;

public class Scrittore implements Runnable {
    private String file;
    private List<Brano> lista;
    private GestioneFile gestioneFile;
    
    public Scrittore(String file,
                     List<Brano> lista,
                     GestioneFile gestioneFile) {
        this.file = file;
        this.lista = lista;
        this.gestioneFile = gestioneFile;
    }
    @Override
    
    public void run() {
        gestioneFile.scriviJson(file, lista);
        System.out.println("File scritto correttamente!");
    }
}
