package excepciones;

import java.util.Scanner;

public class excepcion_personalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120.");
            }

            System.out.println("Edad ingresada correctamente: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: entrada inválida. Debe ingresar un número entero.");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}
