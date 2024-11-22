/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

import pila.Interprete;

import java.io.*;

public class Main {

    static Interprete interprete = new Interprete();

    public static void main(String[] args) throws Exception {
        BufferedReader fichero = new BufferedReader(new FileReader("files/factorial.txt"));
        // BufferedReader fichero = new BufferedReader(new FileReader("files/fibonacci.txt"));

        String linea;
        while ((linea = fichero.readLine()) != null)
            interprete.cargaInstruccion(linea);
        fichero.close();

        interprete.ejecutaPrograma();
    }
}
