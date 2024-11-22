package encuesta;

import datos.Actualizable;
import datos.Dato;

import java.util.ArrayList;
import java.util.List;

public class Encuesta {

    private int si, no;
    private String pregunta;
    private List<Actualizable> datos  = new ArrayList<Actualizable>();

    public Encuesta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public int getVotosSi() {
        return si;
    }

    public int getVotosNo() {
        return no;
    }

    public int getVotos(){
        return getVotosSi() + getVotosNo();
    }

    public void añadirDato(Actualizable dato){
        datos.add(dato);
    }

    public void añadirDatos(List<Actualizable> datos){
        this.datos.addAll(datos);
    }

    public void incrementaSi() {
        si++;
        actualizarDatos();
    }

    public void incrementaNo() {
        no++;
        actualizarDatos();
    }

    private void actualizarDatos() {
        for (Actualizable dato : datos) {
            dato.actualizarDatos(this);
        }
    }

}
