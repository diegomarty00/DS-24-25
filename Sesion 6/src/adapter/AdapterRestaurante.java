package adapter;

import formulario.Formulario;
import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class AdapterRestaurante implements Marcador {

    private Restaurante restaurante;
    private Navegador gps;

    public AdapterRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;

    }

    @Override
    public String toString() {
        return getTitulo() + ".\nDirección: "+ restaurante.getDirección() +
                "\nNúmero de contacto: " + restaurante.getTeléfono() + "\n";
    }

    @Override
    public String getTitulo() {
        return restaurante.getNombre();
    }

    @Override
    public void editar(Formulario formulario) {
        System.out.print("- Nombre: ");
        String texto = formulario.getLínea();
        if (texto.length() > 0)
            restaurante.setNombre(texto);

        System.out.print("- Dirección: ");
        texto = formulario.getLínea();
        if (texto.length() > 0)
            restaurante.setDirección(texto);
    }

    @Override
    public Coordenadas getCoordenadas() {
        return gps.getCoordenadas(restaurante.getDirección());
    }

    @Override
    public String getTooltipInfo() {
        return "- Nombre: " + restaurante.getNombre() + "\n- Dirección: "+restaurante.getDirección();
    }

    @Override
    public void abrir() {
        restaurante.llamar();
    }

}

