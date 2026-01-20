package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class scrittore implements Runnable{

    String musica;

    public Scrittore(String nomeFile){
        this.musica = musica;
    }

    @Override
    public void run() {
        scrivi();
    }

    public void scrivi(){
        BufferedWriter br=null;

        try {

            br = new BufferedWriter(
                    new FileWriter(musica));

            br.write("File in output");
            br.write("\n\r");

            br.flush();
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (br!=null)
                try {
                    //4)chiudo lo stream in uscita
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    }
}