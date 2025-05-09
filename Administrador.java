package principal;

import java.util.Date;

public class Administrador extends Usuario{


    public Administrador(int id, String nombre, String correo, String isbn, String titulo, String autor,
                         boolean disponible, Date fechaInicio, Date fechaDevolucion, String estado) {
        super(id, nombre, correo);

    }
    public void registrarCliente(Cliente C){
    }
    public void registrarLibro(Libro L){
    }
    public void realizarPrestamo(Usuario U, Libro L){
    }

}
