package Runde01;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Kreuzwortkreuze {
    public static void main(String[] args) throws IOException {
        String kwk = Files.readString(Path.of("Bwinf/451/A1_Kreuzwortkreuze/kreuz0a.txt"));
        System.out.println(kwk);


        try {
            List<String> zeilenListe = Files.readAllLines(Paths.get("Bwinf/451/A1_Kreuzwortkreuze/wortliste.txt"));
            String[] liste = zeilenListe.toArray(new String[0]);
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }


        //jetzt die eigentliche arbeit



    }
}
