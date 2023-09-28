import java.io.*;

public class FileTypes {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream(new File("pene.txt")));
        DataInputStream input = new DataInputStream(new FileInputStream("pene.txt"));
        BufferedReader lee = new BufferedReader(new FileReader("pene.txt"));
        int c;

        output.writeInt(20);
        output.writeChar('a');
        output.writeFloat(1.2f);
        output.writeDouble(2.3);
        output.writeUTF("Hola");
        output.writeBoolean(true);

        int intValue = input.readInt();
        char charValue = input.readChar();
        float floatValue = input.readFloat();
        double doubleValue = input.readDouble();
        String stringValue = input.readUTF();
        boolean booleanValue = input.readBoolean();

        System.out.println(intValue);
        System.out.println(charValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(stringValue);
        System.out.println(booleanValue);


        while ((c = lee.read()) != -1) {
            System.out.println((char) c);
        }

        output.close();
        input.close();
        lee.close();
    }
}
