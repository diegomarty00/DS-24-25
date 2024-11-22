package datos;


public class Backup extends Dato {

    public Backup() {
        super(INICIO, PERIODO);
    }

    public Backup(int inicio, int fin) {
        super(inicio, fin);
    }

    @Override
    protected void mostrarDatos() {
        System.out.println("Aquí se guardarán los datos en disco/BD.");
        System.out.println("Hay " + encuesta.getVotosSi() + " si.");
        System.out.println("Hay " + encuesta.getVotosNo() + " no.");
        System.out.println("Hay " + encuesta.getVotos() + " votos.");
    }
}
