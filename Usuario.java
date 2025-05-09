package principal;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;

    public Usuario(int id, String nombre, String correo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Usuario(String id, String nombre, String correo) {
    }
    @Override
    public String toString() {
        return
                "\n----------Cliente:-------------\n" +
                "ID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Correo: " + correo;
    }

}
