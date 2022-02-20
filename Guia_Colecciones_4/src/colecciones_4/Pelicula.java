package colecciones_4;


public class Pelicula{
    
    
    private String titulo;
    private String director;
    private float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float horas) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

   
    
    
    
        
    
    
}
