package adapter;

import formulario.Formulario;
import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Monumento;

public class AdapterMonumento implements Marcador {

    private Monumento monumento;
    private Navegador gps;

    public AdapterMonumento(Monumento monumento) {
        this.monumento = monumento;
    }

    @Override
    public Coordenadas getCoordenadas() {
        return gps.getCoordenadas(monumento.getDirección());
    }

    @Override
    public String getTooltipInfo() {
        return "- Autor: " + monumento.getAutor() + "\n- Dirección: "+monumento.getDirección();
    }

    @Override
    public void abrir() {
        gps.getCoordenadas(monumento.getDirección());
    }

    @Override
    public String getTitulo() {
        return monumento.getNombre();
    }

    @Override
    public void editar(Formulario formulario) {
        System.out.print("- Autor: ");
        String texto = formulario.getLínea();
        if (texto.length() > 0)
            monumento.setAutor(texto);

        System.out.print("- Dirección: ");
        texto = formulario.getLínea();
        if (texto.length() > 0)
            monumento.setDirección(texto);
    }
}
