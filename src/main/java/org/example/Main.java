package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("APP MUSICA\n");
        // Countdown
        Thread c = new Thread(new Countdown());
        c.start();
        
        try {
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        List<Brano> lista = new ArrayList<>();
        System.out.print("Quanti brani vuoi inserire? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nBrano " + (i + 1));
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Titolo: ");
            String titolo = sc.nextLine();
            System.out.print("Cantante: ");
            String cantante = sc.nextLine();
            System.out.print("Durata: ");
            String durata = sc.nextLine();
            System.out.print("Anno: ");
            int anno = sc.nextInt();
            System.out.print("Ascolti: ");
            long ascolti = sc.nextLong();
            System.out.print("Like: ");
            int like = sc.nextInt();
            sc.nextLine();
            
            lista.add(new Brano(
                    id, titolo, cantante,
                    durata, anno, ascolti, like
            ));
        }
        
        String file = "Musica.json";
        GestioneFile gf = new GestioneFile();
        Thread scrittore = new Thread(new Scrittore(file, lista, gf));
        Thread lettore = new Thread(new Lettore(file, gf));
        scrittore.start();

        try {
            scrittore.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lettore.start();
    }
}
