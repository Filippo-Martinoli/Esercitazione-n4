package org.example;
import java.io.FileReader;
import java.io.IOException;

public class lettore implements Runnable{
    String musica;
    public lettore (String musica){
        this.musica=musica;
    }
    public void leggi(){
        FileReader fr;
        int i;
        try {
            fr=new FileReader(musica);
            while ((i=fr.read())!=-1)
                System.out.print((char)i);
            System.out.print("\n\r");
            fr.close();
        } catch (IOException ex){
            System.err.println("Errore in lettura");
        }
    }
    public void run() {
        leggi();
    }

}
