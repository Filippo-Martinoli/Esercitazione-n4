package org.example;

public class Main {
    public static void main(String[] args) {
        Brano b1 = new Brano("FMLEM234","Lo so che", "2:00", "26/03/2020");
        String file = "musica.json";
        Scrittore s = new Scrittore(file);
        Lettore l = new Lettore(file);
        Thread ts = new Thread(s);
        Thread tl = new Thread(l);
        ts.start();

        try {
            ts.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tl.start();
    }
}