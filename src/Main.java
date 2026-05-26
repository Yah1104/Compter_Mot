import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cheminFichier = "monFichier.txt";
        int totalMots = 0;
        try {
            File fichier = new File(cheminFichier);
            Scanner lecture = new Scanner(fichier);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
