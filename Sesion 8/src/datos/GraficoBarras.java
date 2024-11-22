package datos;

public class GraficoBarras extends Dato{

    public GraficoBarras() {
        super(INICIO, PERIODO);
    }

    public GraficoBarras(int inicio, int fin) {
        super(inicio, fin);
    }

    @Override
    protected void mostrarDatos() {
        System.out.println("Aquí se dibujaría el gráfico de barras.");
        System.out.println("Hay "+encuesta.getVotosSi()+" si.");
        System.out.println("Hay "+encuesta.getVotosNo()+" no.");
        System.out.println("Hay "+encuesta.getVotos()+" votos.");
    }
}
