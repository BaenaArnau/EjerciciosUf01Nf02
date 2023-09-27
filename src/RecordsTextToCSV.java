import java.io.*;
import java.util.*;

public class RecordsTextToCSV {
    static ArrayList<String> noms, cognoms, edat;
    public static void main(String[] args) {
        noms = new ArrayList<String>();
        cognoms = new ArrayList<String>();
        edat = new ArrayList<String>();

        llegeixFitxer(new File("personas.txt"));
        mostraPerPantalla();
        escriuSortidaCSV(new File("personas.csv"));
    }
    public static void llegeixFitxer(File f){
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader(f));

            String line = "";

            while ((line = inputStream.readLine()) != null ) {
                noms.add(line);
                line = inputStream.readLine();
                cognoms.add(line);
                line = inputStream.readLine();
                edat.add(line);
                line = inputStream.readLine();
            }

            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void mostraPerPantalla() {
        System.out.println("nom, cognoms, edat");

        for (int i = 0; i < noms.size() ; i++) {
            System.out.print(noms.get(i) + "," + cognoms.get(i) +"," + edat.get(i));
            System.out.println();
        }
    }
    public static void escriuSortidaCSV(File f) {
        try {
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(f, false));

            outputStream.write("nom, cognoms, edat");
            outputStream.newLine();

            for (int i = 0; i < noms.size() ; i++) {
                outputStream.write(noms.get(i));
                outputStream.write(",");
                outputStream.write(cognoms.get(i));
                outputStream.write(",");
                outputStream.write(edat.get(i));
                outputStream.newLine();
            }

            outputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}