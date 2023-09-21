import java.io.*;
import java.util.Scanner;
public class ComptaVocals {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] contador = new int[5];
        String fichero, linea;
        char[] lista;
        char[] vocales = {'a','e','i','o','u'};

        System.out.println("Fichero para contar vocales");
        fichero = entrada.nextLine();
        File file = new File("ComptaVocals.csv");

        try {
            BufferedReader output = new BufferedReader(new FileReader(fichero));
            BufferedWriter input = new BufferedWriter(new FileWriter(file));
            while ((linea = output.readLine()) != null){
                lista= linea.toCharArray();
                for (int i = 0; i < lista.length; i++){
                    if (lista[i] == 'a' | lista[i] == 'A'){
                        contador[0]++;
                    }

                    if (lista[i] == 'e' | lista[i] == 'E'){
                        contador[1]++;
                    }

                    if (lista[i] == 'i' | lista[i] == 'I'){
                        contador[2]++;
                    }

                    if (lista[i] == 'o' | lista[i] == 'O'){
                        contador[3]++;
                    }

                    if (lista[i] == 'u' | lista[i] == 'U'){
                        contador[4]++;
                    }
                }
            }
            output.close();
            for (int i = 0; i < vocales.length; i++){
                input.write((char) vocales[i] + ",");
            }
            input.newLine();
            for (int i = 0; i < contador.length; i++){
                input.write((int) contador[i] + ",");
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
