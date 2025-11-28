/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550590;

import java.util.Scanner;

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
        
        Scanner captu = new Scanner(System.in);

        int val;
        int opcion;

        // Solicitar el numero entero
        System.out.println("Introduzca un numero entero:");
        val = captu.nextInt();

        // pedirle lo que quiere
        System.out.println("Que desea imprimir?");
        System.out.println("Numeros primos (presiona 1)");
        System.out.println("Numeros no primos (presiona 2)");
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

        }
    }
}
