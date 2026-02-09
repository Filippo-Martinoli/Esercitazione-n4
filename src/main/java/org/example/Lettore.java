package org.example;

public class Lettore implements Runnable {
    private String file;
    private GestioneFile gestioneFile;

    public Lettore(String file, GestioneFile gestioneFile) {
        this.file = file;
        this.gestioneFile = gestioneFile;
    }

    @Override
    public void run() {
        System.out.println("\n LETTURA FILE ");
        gestioneFile.leggiBuffered(file);
        System.out.println("\n BRANI LETTI ");
        for (Brano b : gestioneFile.leggiGson(file)) {
            System.out.println(b);
        }
    }
}
