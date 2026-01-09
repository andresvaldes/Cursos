package cursos;

import cursos.model.Estudiante;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Creamos la lista de estudiantes con "<>" debido a que debe ser dinamico porque no sabemos la cantidad de alumnos
        ArrayList<Estudiante> lista = new ArrayList<>();

        int cantidad;

        // Pedir la cantidad de alumnos y validar que sea > 0
        do {
            System.out.print("Por favor, ingresa la cantidad de alumnos: ");
            cantidad = lector.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad de alumnos debe ser mayor a 0");
            }
        } while (cantidad <= 0);

        lector.nextLine(); 

        System.out.println("Vamos a registrar a los " + cantidad + " alumnos.");
        
        // El siguiente paso será el ciclo FOR aquí...
        for(int i=0;i<cantidad;i++){
            System.out.println("\n--- Registro del Alumno " + (i + 1) + " ---");
    
            System.out.print("Nombre: ");
            String nombre = lector.nextLine();

            System.out.print("Edad: ");
            int edad = lector.nextInt();

            System.out.print("Nota Final: ");
            double nota = lector.nextDouble();

            lector.nextLine(); 

            Estudiante nuevoAlumno = new Estudiante(nombre, edad, nota);
            lista.add(nuevoAlumno);
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE CONSULTAS ---");
            System.out.println("1. Mostrar todos los estudiantes");
            System.out.println("2. Mostrar estudiantes aprobados (nota >= 6.0)");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");
    
            opcion = lector.nextInt();

            if (opcion == 1) {
                System.out.println("\nLISTADO TOTAL:");
                // Ciclo para mostrar todos
                for (int i = 0; i < lista.size(); i++) {
                    Estudiante e = lista.get(i);
                    System.out.println("Nombre: " + e.getNombre() + " | Nota: " + e.getNotaFinal());
                }

            } else if (opcion == 2) {
                System.out.println("\nESTUDIANTES APROBADOS:");
                // Ciclo con filtro
                for (int i = 0; i < lista.size(); i++) {
                    Estudiante e = lista.get(i);
                    if (e.getNotaFinal() >= 6.0) {
                        System.out.println("Nombre: " + e.getNombre() + " | Nota: " + e.getNotaFinal());
                    }
                }

                } else if (opcion == 3) {
                        System.out.println("Saliendo del programa.");

                    } else {
                System.out.println("Opción no válida. Intente de nuevo.");
                }

            } while (opcion != 3);
    }
}