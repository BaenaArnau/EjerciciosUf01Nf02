import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomWrite {
    public static void main(String[] args) throws FileNotFoundException {
        char[] apellido = new char[10];
        int identificador, departamento;
        double salario;

        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("profesores.txt"), "rw");



    }
}
