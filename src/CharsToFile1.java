import java.io.*;

public class CharsToFile1 {
    public static void main(String[] args) {
        File letras = new File("alphabeta.txt");
        try {
            BufferedWriter input = new BufferedWriter(new FileWriter(letras));
            for (char i = 'a'; i <= 'z'; i++) {
                input.write(i);
                input.newLine();
            }
            input.close();
            System.out.println("Archivo creado.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
