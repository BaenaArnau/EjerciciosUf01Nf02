import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class AlumnesDOM1 {
    Document document;

    public AlumnesDOM1() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.newDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void agregarNodo(Document document, Node padre, String nombreElemento, String texto) {
        Node nodo = document.createElement(nombreElemento);
        nodo.appendChild(document.createTextNode(texto));
        padre.appendChild(nodo);
    }

    public int addAlumnesToDOM(String nom, String dni, String cognom1, String cognom2, String ciutat, ArrayList<String> asignaturas) {
        try {
            Node rootNode = document.createElement("Alumnos");
            document.appendChild(rootNode);

            Node alumnaNode = document.createElement("Alumna");

            agregarNodo(document, alumnaNode, "Nom", nom);
            agregarNodo(document, alumnaNode, "DNI", dni);
            agregarNodo(document, alumnaNode, "Cognom1", cognom1);
            agregarNodo(document, alumnaNode, "Cognom2", cognom2);
            agregarNodo(document, alumnaNode, "Ciutat", ciutat);

            Node asignaturasNode = document.createElement("Asignaturas");
            for (String asignatura : asignaturas) {
                Node asignaturaNode = document.createElement("Asignatura");
                asignaturaNode.appendChild(document.createTextNode(asignatura));
                asignaturasNode.appendChild(asignaturaNode);
            }
            alumnaNode.appendChild(asignaturasNode);

            rootNode.appendChild(alumnaNode);

            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int saveFile(File file) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Esto activa la indentación
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(file);
            transformer.transform(domSource, streamResult);

            System.out.println("\n## DOM saved as file in: " + file.getPath() + "\n");
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        File output = new File("alumnos.xml");

        AlumnesDOM1 alumnos = new AlumnesDOM1();
        ArrayList<String> asignaturas = new ArrayList<>(Arrays.asList("Informatica", "Valores", "Programacion"));

        alumnos.addAlumnesToDOM("Arnau", "sdas2312413", "Baena", "Perez", "Sta de Gramenet", asignaturas);
        alumnos.saveFile(output);
    }
}
