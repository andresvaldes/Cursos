package cursos.model;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaFinal() { return notaFinal; }
}
