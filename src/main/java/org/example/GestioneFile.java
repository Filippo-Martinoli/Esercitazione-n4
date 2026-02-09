package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;

public class GestioneFile {
  //lettura normale 
    public void leggiBuffered(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                System.out.println(riga);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//lettura con Gson
    public List<Brano> leggiGson(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            Gson gson = new Gson();
            Brano[] brani = gson.fromJson(br, Brano[].class);
            return Arrays.asList(brani);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }
    // scrittura con JSON
    public void scriviJson(String file, List<Brano> lista) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write(gson.toJson(lista));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

