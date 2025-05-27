package excepciones;

import java.util.Scanner;

public class conversion_cadenaANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero entero");
            String entrada = scanner.nextLine();

            int numero = Integer.parseInt(entrada);
            System.out.println("Numero ingresado correctamente: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: El valor ingresado no es un numero entero");
        } finally {
            System.out.println("Programa terminado");
            scanner.close();
        }
    }
}