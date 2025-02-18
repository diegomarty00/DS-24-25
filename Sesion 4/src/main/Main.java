package main;

import campos.*;
import formulario.Formulario;

/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

public class Main {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();

        formulario.addCampo(new CampoTexto("Nombre"));
        formulario.addCampo(new CampoTexto("Apellido"));
        formulario.addCampo(new CampoNumero("Teléfono"));
        formulario.addCampo(new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz"));
        formulario.addCampo(new CampoNumero(new CampoLongitud("Código Postal", 5)));
        formulario.addCampo(new CampoEdad("Edad"));
        formulario.addCampo(new CampoProducto("Código Producto"));
        formulario.addCampo(new CampoPromocion("Código Promocional"));
        formulario.addCampo(new CampoSueldo("Sueldo"));

        formulario.pideDatos();
    }
}
