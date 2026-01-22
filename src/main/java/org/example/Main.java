package org.example;

public class Main {
    public static void main(String[] args) {
        String file = "musica.json";
        scrittore s = new scrittore(file);
        lettore l = new lettore(file);
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