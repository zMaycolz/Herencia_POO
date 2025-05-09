package principal;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor, boolean disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro(String isbn, String titulo, String autor) {
    }
    @Override
    public String toString() {
        return "\n--------------Libro:------------\n" +
                "ISBN: " + isbn + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Disponible: " + (disponible ? "Sí" : "No");
    }

}
