package colecciones_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PaisesService {

    private Scanner scanner;
    private HashSet<Pais> paises;

    public PaisesService() {
        this.scanner = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.paises = new HashSet<>();
    }

    public void crearPais(String nombre, String continente) {

        Pais pais = new Pais();
        pais.setNombre(nombre);
        pais.setContinente(continente);
        agregarPais(pais);
    }

    public void agregarPais(Pais pais) {
        this.paises.add(pais);
    }

    public void cargarDatosPaises() {
        System.out.println("Ingrese el nombre del país:");
        String nombre = scanner.next();
        System.out.println("Ingrese el continente del país:");
        String continente = scanner.next();
        crearPais(nombre, continente);
    }

    public void menuCargarPais() {
        String rta = "";
        do {
            if (this.paises.isEmpty()) {
                cargarDatosPaises();
            } else {
                System.out.println("¿Desea cargar otra pais?\nS/N");
                rta = this.scanner.next().toUpperCase();

                switch (rta) {
                    case "S":
                        cargarDatosPaises();
                        break;
                    case "N":
                        System.out.println("El/los pais/es fue/ron añadido/s al sistema");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }
            }
        } while (!rta.equalsIgnoreCase("n"));

    }

    public void mostrarPaises() {
        for (Pais pais : paises) {
            System.out.println(pais.toString());
        }
    }

    public void buscarYRemoverPais() {
        System.out.println("Ingrese el país a eliminar de la lista:");
        String pais = scanner.next();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
            }
        }
        mostrarPaises();
    }

    public void ordenarAlfabeticamente() {
        System.out.println("\nPaises ordenados alfabéticamente: \n");
        ArrayList<Pais> paisLista = new ArrayList<>(paises);
        Collections.sort(paisLista, new OrdenarAlfabeticamente());
        for (Pais pais : paisLista) {
            System.out.println(pais);
        }
    }
}
