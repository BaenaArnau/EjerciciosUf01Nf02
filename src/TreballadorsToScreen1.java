import java.io.*;

public class TreballadorsToScreen1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] lista;
        String conjunto;
        int cosa = 0;
        int contador = 1;

        BufferedReader output = new BufferedReader(new FileReader("treballadors.txt"));
        try {
            conjunto = output.readLine();
            lista = conjunto.split(",");
            while (conjunto != null & lista.length >= cosa) {
                System.out.println("TREBALLADOR" + (contador));
                for (int i = 0; i < 3; i++){
                    System.out.println();
                    System.out.println(lista[cosa]);
                    cosa++;
                    System.out.println();
                    System.out.println(lista[cosa]);
                    cosa++;
                    System.out.println();
                    System.out.println(lista[cosa]);
                    cosa++;
                    System.out.println();
                    System.out.println(lista[cosa]);
                    cosa++;
                    System.out.println();
                }
            }
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
