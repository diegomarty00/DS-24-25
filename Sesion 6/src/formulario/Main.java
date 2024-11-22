package formulario;

import adapter.AdapterFoto;
import adapter.AdapterMonumento;
import adapter.AdapterRestaurante;
import database.Database;
import google.maps.*;
import model.*;

public class Main {

    public static void main(String[] args) {

        Monumento monumento = new Monumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");
        Restaurante restaurante = new Restaurante("Mario", "Via della Dataria. Roma", "555 123 457");
        Foto foto = new Foto("Raúl", "Un perro mordiendo a un turista", new Coordenadas(40, 40));
        Database database = new Database();
        Mapa mapa = new Mapa();

        MiniFormulario miniFormulario = new MiniFormulario();
        miniFormulario.editar(monumento);

        // Tarea 1. Editar también restaurante. Que se puedan editar el nombre y la dirección del mismo.
        Formulario formulario = new Formulario();
        formulario.editar(new AdapterFoto(foto));

        // Tarea 2. Editar también foto. Que se puedan editar el usuario y la descripción de la misma.
        formulario.editar(new AdapterRestaurante(restaurante));

        // NOTA: Para simplificar, suponer que siempre se van a pedir sólo dos campos en todo formulario
        System.out.println("\n . Se añaden varios elementos al mapa...");

        for (Monumento m : database.selectMonumentos()) {
            AdapterMonumento am = new AdapterMonumento(m);
            mapa.add(am);
        }

        for (Foto f : database.selectFotos()) {
            AdapterFoto ap = new AdapterFoto(f);
            mapa.add(ap);
        }

        for (Restaurante r : database.selectRestaurantes()) {
            AdapterRestaurante ar = new AdapterRestaurante(r);
            mapa.add(ar);
        }
    }

}
