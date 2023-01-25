package GestionColegio;

public class Curso {

	private String asignatura;
    private Alumno[] lista;
    private int numAlumnos;
    private int maxAlumnos = 30;

    public Curso(String asignatura) {
        this.asignatura = asignatura;
        this.lista = new Alumno[maxAlumnos];
        this.numAlumnos = 0;
    }
}
