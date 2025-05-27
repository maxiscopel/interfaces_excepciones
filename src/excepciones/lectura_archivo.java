package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lectura_archivo {
    public static void main(String[] args) {
        Scanner scannerArchivo = null;

        try {
            File archivo = new File("lectura.txt");
            scannerArchivo = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (scannerArchivo.hasNextLine()) {
                String linea = scannerArchivo.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println(" Error: El archivo no se encontró.");
        } finally {
            if (scannerArchivo != null) {
                scannerArchivo.close();
            }
            System.out.println("Programa finalizado.");
        }
    }
}