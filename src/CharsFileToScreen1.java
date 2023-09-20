import java.io.*;

public class CharsFileToScreen1 {
    public static void main(String[] args) {
        String caracteres;
        char carcacter;
        try {
            BufferedReader output = new BufferedReader(new FileReader("alphabeta.txt"));
            while((caracteres = output.readLine()) != null){
                carcacter = caracteres.charAt(0);
                carcacter = (char) (carcacter-32);
                System.out.println(caracteres + "," + carcacter);
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
