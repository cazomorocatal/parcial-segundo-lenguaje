/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainn;
import java.util.Scanner;
/**
 *
 * @author 0xx0k
 */
public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Estudiante estudiante = null;
        Profesor profesor = null;
        
        int opcion = 0;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Profesor");
            System.out.println("3. Mostrar Información de Todos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("REGISTRO DE ESTUDIANTE");
                    System.out.print("Ingrese nombre: ");
                    String nombreEst = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edadEst = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese documento: ");
                    String docEst = scanner.nextLine();
                    System.out.print("Ingrese programa: ");
                    String programa = scanner.nextLine();
                    System.out.print("Ingrese promedio: ");
                    double promedio = scanner.nextDouble();
                    scanner.nextLine();

                    estudiante = new Estudiante(nombreEst, edadEst, docEst, programa, promedio);
                    System.out.println("¡Estudiante registrado con éxito!");
                    break;

                case 2:
                    System.out.println("REGISTRO DE PROFESOR");
                    System.out.print("Ingrese nombre: ");
                    String nombreProf = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edadProf = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese documento: ");
                    String docProf = scanner.nextLine();
                    System.out.print("Ingrese área: ");
                    String area = scanner.nextLine();
                    System.out.print("Ingrese salario base: ");
                    double salarioBase = scanner.nextDouble();
                    System.out.print("Ingrese horas cátedra: ");
                    int horasCatedra = scanner.nextInt();
                    scanner.nextLine();

                    profesor = new Profesor(nombreProf, edadProf, docProf, area, salarioBase, horasCatedra);
                    System.out.println("¡Profesor registrado con éxito!");
                    break;

                case 3:
                 
                    System.out.println("          INFORMACIÓN REGISTRADA        ");
    ;

                    if (estudiante != null) {
                        System.out.println("DATOS DEL ESTUDIANTE");
                        System.out.println("Rol: " + estudiante.getRol());
                        estudiante.mostrarInfo();
                    } else {
                        System.out.println("\n[No se ha registrado ningún estudiante]");
                    }

                    if (profesor != null) {
                        System.out.println("DATOS DEL PROFESOR");
                        System.out.println("Rol: " + profesor.getRol());
                        profesor.mostrarInfo();
                    } else {
                        System.out.println("\n[No se ha registrado ningún profesor]");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}