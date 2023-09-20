import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAlpha {
    public static void main(String[] args) {
        String caracteres;
        char carcacter;
        try {
            BufferedReader output = new BufferedReader(new FileReader("alphabeta5465.txt"));
            while((caracteres = output.readLine()) != null){
                carcacter = caracteres.charAt(0);
                System.out.print((char) (carcacter - 32) + " ");
            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
