import java.io.IOException;
import java.io.*;
public class OutputBytes {

    public static void main(String[] args) {
        int data[] = {65, 66, 67, 68, 69};

        try {
            FileOutputStream fos = new FileOutputStream("alphabeta.txt");
            for (int i = 0; i < data.length; i++) {
                fos.write(data[i]);
            }
            fos.close();
        } catch(IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}