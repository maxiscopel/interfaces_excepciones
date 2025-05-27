package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWith {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
