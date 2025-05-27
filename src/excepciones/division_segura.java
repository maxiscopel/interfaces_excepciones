package excepciones;

import java.util.Scanner;

public class division_segura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingrese el primer numero");
            int numerador = scanner.nextInt();

            System.out.println("Ingrese el segundo numero");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("El resultado de la division es: "+ resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por 0");
        } catch (Exception e) {
            System.out.println("Error: asegurese de ingresar un numero");
        } finally {
            System.out.println("Programa terminado");
            scanner.close();
        }
    }
}