package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scrittore implements Runnable {
    private String Musica;
    private Object Brano;

    public Scrittore(String nomeFile) {
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
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);

                }
        }
    }

    public void salvaSuFile(Brano brano) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(Brano);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("musica.json"))) {
            writer.write(json);
        }
    }
}

