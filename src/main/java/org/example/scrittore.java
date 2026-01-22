package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class scrittore implements Runnable {
    private String Musica;
    public scrittore(String nomeFile) {
        this.Musica = nomeFile;
    }
    @Override
    public void run() {
        scrivi();
    }
    public void scrivi() {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(Musica));
            br.write("File in output");
            br.write("\n");
            br.flush();
        } catch (IOException ex) {
            Logger.getLogger(scrittore.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(scrittore.class.getName()).log(Level.SEVERE, null, ex);

                }
        }
    }
}

