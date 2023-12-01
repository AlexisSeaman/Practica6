package practica6;
import java.util.Scanner;

public class mainGrupo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Clave del Grupo: ");
        int claveGrupo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre de la Materia: ");
        String nombreMateria = scanner.nextLine();

        System.out.print("Nombre del Profesor: ");
        String nombreProfesor = scanner.nextLine();

        System.out.print("Cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        Grupo grupo = new Grupo(claveGrupo, new Materia(nombreMateria), new Profesor(nombreProfesor), cantidadAlumnos);

        for (int i=0; i<cantidadAlumnos; i++) {
            System.out.print("Nombre del Alumno " +(i+1) + ": ");
            String nombreAlumno = scanner.next();
            grupo.setAlumno(i, new Alumno(nombreAlumno));
        }

        grupo.imprimirDatosGrupo();

        scanner.close();
    }
}