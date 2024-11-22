/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import java.io.*;

import fileSystem.FileSystem;
import fileSystem.Output;
import filtros.*;
import output.*;

public class Main {

    /**
     *
     * @param args
     * @throws IOException
     *
    public static void main(String[] args) throws IOException {
        FileSystem fs = new FileSystem();
        System.out.println("Hola");
        fs.copyFile("files/privado.txt", "files/copia.txt");
        fs.sendToInternet("files/privado.txt", "156.17.11.196");
        fs.sendWithBluetooth("files/privado.txt", "Galaxy de Raúl");
    }
    */
    public static void main(String[] args) throws IOException {

        FileSystem system = new FileSystem();
        FiltroContador contador;

        // Modificación 1
        system.copyFile("files/privado.txt", new FileOutput("a.txt"));
        system.copyFile("files/privado.txt",
                new FiltroEncriptar(new FileOutput("b.txt")));

        // Modificación 2
        system.copyFile("files/privado.txt",
                new FiltroNormalizar(new Internet("1.1.1.1")));
        system.copyFile("files/privado.txt",
                new FiltroEspacio(new Internet("1.1.1.2")));
        system.copyFile("files/privado.txt", new FiltroEspacio(
                new FiltroNormalizar(new Internet("1.1.1.3"))));

        // Modificación 3
        contador = new FiltroContador(new Bluetooth("contarBluetooth.txt"));
        system.copyFile("files/privado.txt", contador);
        System.out.println(
                "Inicialmente había " + contador.getContador() + " caracteres");

        // Modificación 4
        contador = new FiltroContador(new FiltroNormalizar(
                new Bluetooth("contarBluetoothNormalizado.txt")));
        system.copyFile("files/privado.txt", contador);
        System.out.println("Después de normalizar, se han enviado "
                + contador.getContador() + " caracteres");

        // Modificación 5
        Output[] lista = { new Internet("1.1.1.1"), new Bluetooth("Galaxy S") };
        system.copyFile("files/privado.txt", new FiltroGrande(lista));

    }
}
