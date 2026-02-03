package org.example;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Brano b1 = new Brano ("FMLEM234", "Lo So Che", "3:01", "15/11/2024 ", 44000000, 44000,"Capo Plaza");
        String file = "Musica.json";
        Scrittore s = new Scrittore(file);
        s.setBrano(b1);
        Lettore l = new Lettore(file);
        Thread ts = new Thread(s);
        Thread tl = new Thread(l);
        ts.start();

        Brano b2 = l.leggiDalFile();
        System.out.println(b2);
        try {
            ts.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tl.start();
    }
}

