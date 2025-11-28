/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550590;

/**
 *
 * @author invitado
 */
public class EXAMEN2_25550590 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int val;
        int opcion;
        

        // Solicitar el numero entero
        System.out.println("Introduzca un numero entero:");
        val = captu.nextInt();

        // pdrirle lo que quiere
        System.out.println("Que desea imprimir?");
        System.out.println("Numeros primos (presiona 1))");
        System.out.println("Numeros no pirmos (presiona 2)");
        System.out.print("Opcion: ");
        opcion = captu.nextInt();
        for (int i = 2; i <= val; i++) {

            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Si elige primos y el número es primo
            if (opcion == 1 && esPrimo) {
                System.out.print(i + "");
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                
            }

        } 
    }
}