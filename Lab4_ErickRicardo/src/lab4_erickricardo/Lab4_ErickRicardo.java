/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_erickricardo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab4_ErickRicardo {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("*** Seguridad Nacional ***");
            System.out.println("1. Almacen");
            System.out.println("2. Persona");
            System.out.println("3. Producto");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("-> Almacen");
                    System.out.println("1. Crear");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Tranferir");
                    System.out.print("Ingrese su opcion: ");
                    int opcion2 = sc.nextInt();
                    switch (opcion2) {

                    }
                    break;
                case 2:
                    System.out.println("-> Persona");
                    System.out.println("1. Crear");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.print("Ingrese su opcion: ");
                    int opcion3 = sc.nextInt();
                    switch (opcion3) {

                    }
                    break;
                case 3:
                    System.out.println("-> Producto");
                    System.out.println("1. Crear");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.print("Ingrese su opcion: ");
                    int opcion4 = sc.nextInt();
                    switch (opcion4) {

                    }
                    break;
            }
        } while (opcion != 4);
    }

}
