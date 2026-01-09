package cursos;

import cursos.model.Estudiante;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Creamos la lista de estudiantes con "<>" debido a que debe ser dinamico porque no sabemos la cantidad de alumnos
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

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
            System.out.println("Ingresa ");
        }
    }
}