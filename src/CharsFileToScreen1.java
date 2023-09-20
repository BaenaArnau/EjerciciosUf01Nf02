import java.io.*;

public class CharsFileToScreen1 {
    public static void main(String[] args) {
        String caracteres;
        try {
            BufferedReader output = new BufferedReader(new FileReader("alphabeta.txt"));
            while((caracteres = output.readLine()) != null){
                System.out.println(caracteres);
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
