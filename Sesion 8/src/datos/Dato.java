package datos;

import encuesta.Encuesta;

import java.io.Serializable;

public abstract class Dato implements Actualizable{
    public static final int INICIO = 1;
    public static final int PERIODO = 1;

    int inicio;
    int periodo;
    Encuesta encuesta;


    public Dato(int inicio, int periodo) {
        this.inicio = inicio;
        this.periodo = periodo;
    }

    @Override
    public void actualizarDatos(Encuesta encuesta) {
        this.encuesta = encuesta;
        if (inicio > (encuesta.getVotos()) || encuesta.getVotos()%periodo == 0){
            mostrarDatos();
        }
    }

    protected abstract void mostrarDatos();
}
