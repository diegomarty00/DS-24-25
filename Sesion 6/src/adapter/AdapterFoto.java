package adapter;

import formulario.Formulario;
import google.maps.Coordenadas;
import model.Foto;
import google.maps.Marcador;

public class AdapterFoto implements Marcador {

    private Foto foto;

    public AdapterFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return getTitulo() + ". Creado por " + foto.getUsuario() + "\n";
    }


    @Override
    public String getTitulo() {
        return foto.getDescripción();
    }

    @Override
    public void editar(Formulario formulario) {
        System.out.print("- Usuario: ");
        String texto = formulario.getLínea();
        if (texto.length() > 0)
            foto.setUsuario(texto);

        System.out.print("- Descripción: ");
        texto = formulario.getLínea();
        if (texto.length() > 0)
            foto.setDescripción(texto);

    }


    @Override
    public Coordenadas getCoordenadas() {
        return foto.getCoordenadas();
    }

    @Override
    public String getTooltipInfo() {
        return "- Usuario: " + foto.getUsuario() + "\n- Descripción: "+foto.getDescripción();
    }

    @Override
    public void abrir() {
        foto.descargar();
    }

}

