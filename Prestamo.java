package principal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo{
        private Date fechaInicio;
        private Date fechaDevolucion;
        private String estado;   //(Activo/Entregado).

    public Prestamo(Date fechaInicio, Date fechaDevolucion, String estado) {
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    public Prestamo(Cliente cliente, Libro libro) {
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioFormateada = sdf.format(fechaInicio);
        String fechaFinFormateada = sdf.format(fechaDevolucion);

        return "\n----------Prestamo:----------\n" +
                "Fecha de Inicio: " + fechaInicioFormateada + "\n" +
                "Fecha de Devolución: " + fechaFinFormateada + "\n" +
                "Estado: " + estado;
    }
}
