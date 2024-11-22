package formulario;

import google.maps.Marcador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Formulario básico para usar cuando se quieran pedir solo dos valores sobre algo */
public class Formulario {

    BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

    public void editar(Marcador marcador) {

        System.out.println("Editando Monumento.");

        System.out.println("Valores actuales:");
        imprimeMarcador(marcador);

        System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");

        marcador.editar(this);

        System.out.println("Valores finales:");
        imprimeMarcador(marcador);
    }

    private void imprimeMarcador(Marcador marcador) {
        System.out.println(marcador.getTooltipInfo());
    }

    public String getLínea() {
        do {
            try {
                return consola.readLine();
            } catch (IOException ex) {
                System.out.println("Error de lectura. Inténtelo de nuevo.");
            }
        } while (true);
    }

}
