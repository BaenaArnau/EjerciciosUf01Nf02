import java.io.*;
import java.util.*;
public class TreballadorsToFile1 {
    public static void main(String[] args){
        File treballadors = new File("treballadors.txt");
        try {
            Scanner entrada = new Scanner(System.in);
            String nombre, apellido, respuesta;
            int salario;
            boolean casado;
            BufferedWriter input = new BufferedWriter(new FileWriter(treballadors));

            while (true){
                System.out.println("Nombre:");
                nombre = entrada.nextLine();
                System.out.println("Apellido:");
                apellido = entrada.nextLine();
                System.out.println("Salario:");
                salario = entrada.nextInt();
                System.out.println("Casado:");
                casado = entrada.nextBoolean();

                input.write(nombre+","+apellido+","+salario+","+casado+",");
                System.out.println("Archivo creado.");

                System.out.println("Quieres continuar? (Y/N)");
                entrada.nextLine();
                respuesta = entrada.nextLine();
                if (!respuesta.equals("Y")){
                    break;
                }
            }
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
