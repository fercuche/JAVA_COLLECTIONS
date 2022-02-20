package colecciones_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoService {

    private ArrayList<Alumno> alumnos;
    private Scanner entrada;

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    }

    public void crearAlumno(String nombre, ArrayList<Integer> notas) {
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        agregarAlumno(alumno);
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public Alumno buscarAlumno(String nombre) {
        Alumno alumnoRetorno = null;
        for (Alumno alumno : this.alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                return alumno;
            }
        }
        return alumnoRetorno;
    }

    public double obtenerPromedio(Alumno alumno) {
        int acumulador = 0;
        for (Integer nota : alumno.getNotas()) {
            acumulador += nota;
        }
        return (double) acumulador / alumno.getNotas().size();
    }

    public void ingresarNombreYNotas() {
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO:");
        String nombre = entrada.next();

        System.out.println("INGRESE LA NOTA 1 DEL ALUMNO:");
        int nota1 = entrada.nextInt();

        System.out.println("INGRESE LA NOTA 2 DEL ALUMNO:");
        int nota2 = entrada.nextInt();

        System.out.println("INGRESE LA NOTA 3 DEL ALUMNO:");
        int nota3 = entrada.nextInt();

        crearAlumno(nombre, new ArrayList<>(Arrays.asList(nota1, nota2, nota3)));
    }

    public void crearAlumno() {

        String respuesta = "";

        do {
            if (this.alumnos.isEmpty()) {
                ingresarNombreYNotas();
            } else {
                System.out.println("¿DESEA SEGUIR INGRESANDO ALUMNOS? S/N");
                respuesta = this.entrada.next().toUpperCase();

                switch (respuesta) {
                    case "S":
                        ingresarNombreYNotas();
                        break;
                    case "N":
                        System.out.println("OPERACIÓN FINALIZADA");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                        break;
                }
            }
        } while (!respuesta.equals("N"));
    }

    public void obtenerNotaFinal() {
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO QUE DESEA HALLAR:");
        String nombre = this.entrada.next();
        Alumno alumno = buscarAlumno(nombre);

        if (alumno != null) {
            System.out.printf("%.2f\n", obtenerPromedio(alumno));
        } else {
            System.out.println("NO EXISTE UN ALUMNO CON EL NOMBRE INGRESADO");
        }
    }

}
