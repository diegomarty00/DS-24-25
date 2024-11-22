package datos;

public class GraficoCircular extends Dato{

    public GraficoCircular() {
        super(INICIO, PERIODO);
    }

    public GraficoCircular(int inicio, int fin) {
        super(inicio, fin);
    }

    @Override
    protected void mostrarDatos() {
        System.out.println("Aquí se dibujaría el gráfico circular.");
        System.out.println("Hay "+encuesta.getVotosSi()+" si.");
        System.out.println("Hay "+encuesta.getVotosNo()+" no.");
        System.out.println("Hay "+encuesta.getVotos()+" votos.");
    }
}
