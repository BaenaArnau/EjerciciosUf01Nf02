import java.io.*;

public class NumsToFile1 {
    public static void main(String[] args) {
        File numeros = new File("Num11001200.txt");
        try {
            BufferedWriter input = new BufferedWriter(new FileWriter(numeros));
            for (int i = 1100; i <= 1200; i++) {
                input.write(""+i);
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
