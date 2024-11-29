package videoclub;

public class Pelicula {
    private String titulo;
    private int categoria;

    public static final int NORMAL = 0;
    public static final int NOVEDAD = 1;
    public static final int INFANTIL = 2;

    public Pelicula(String titulo, int categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    protected double getPrecioAlquiler(int days) {
        double precioAlquiler = 0;
        switch (this.getCategoria()) {
            case Pelicula.NOVEDAD:
                precioAlquiler = days * 3;
                break;
            case Pelicula.NORMAL:
                precioAlquiler += 2;
                if (days > 2)
                    precioAlquiler += (days - 2) * 1.5;
                break;
            case Pelicula.INFANTIL:
                precioAlquiler += 1.5;
                if (days > 3)
                    precioAlquiler += (days - 3) * 1.5;
                break;
        }
        return precioAlquiler;
    }

    public int getPuntos(int day) {
        // Añade los puntos de alquiler frecuente
        int puntos = 1;
        // Un punto extra en el caso de las novedades alquiladas por un período de dos o más días
        if ((getCategoria() == Pelicula.NORMAL) && day > 1)
            puntos++;
        return puntos;
    }
}
