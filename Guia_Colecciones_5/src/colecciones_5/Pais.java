
package colecciones_5;

import java.util.Objects;

public class Pais {
    
    private String nombre;
    private String continente;

    public Pais() {
    }

    public Pais(String nombre, String continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.continente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.continente, other.continente)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Pais{" + "Nombre= " + nombre + "\nContinente= " + continente + '}';
    }
    
    
    
}
