import java.io.*;
import java.util.Scanner;
public class RecordsTextToCSV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fichero,linea;
        String[] personas = new String[3];

        System.out.println("Escribe el nombre del fichero que contiene personas");
        fichero = entrada.nextLine();

        try {
            BufferedReader output = new BufferedReader(new FileReader(fichero));
            File file = new File("persona.csv");
            BufferedWriter input = new BufferedWriter(new FileWriter(file));
            input.write("Nombre,Apellido,edad");
            input.newLine();

            while((linea = output.readLine()) != null){
                for (int i = 0; i < 3; i++){
                    personas[i] = linea;
                }
                input.write(personas[0]+","+personas[1]+","+personas[2]);
                input.newLine();
            }
            output.close();
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
