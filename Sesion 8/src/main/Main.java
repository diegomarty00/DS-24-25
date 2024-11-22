package main;

import java.io.*;

import datos.Backup;
import datos.GraficoBarras;
import datos.GraficoCircular;
import encuesta.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Encuesta encuesta = new Encuesta("¿Está a favor de la energia nuclear?");

        encuesta = exercice3(encuesta);

        TextUserInterface userInterface = new TextUserInterface();
        userInterface.rellena(encuesta);
    }

    public static Encuesta exercice1(Encuesta encuesta) throws IOException {

        encuesta.añadirDato(new Backup());

        return encuesta;
    }

    public static Encuesta exercice2(Encuesta encuesta) throws IOException {

        encuesta.añadirDato(new Backup());
        encuesta.añadirDato(new GraficoCircular());

        return encuesta;
    }

    public static Encuesta exercice3(Encuesta encuesta) throws IOException {

        encuesta.añadirDato(new Backup());
        encuesta.añadirDato(new GraficoCircular(1,3));

        return encuesta;
    }

    public static Encuesta exercice4(Encuesta encuesta) throws IOException {

        encuesta.añadirDato(new Backup());
        encuesta.añadirDato(new GraficoBarras(1,3));
        encuesta.añadirDato(new GraficoCircular());

        return encuesta;
    }

    public static Encuesta exercice5(Encuesta encuesta) throws IOException {

        encuesta.añadirDato(new Backup(4,2));
        encuesta.añadirDato(new GraficoBarras(1,3));
        encuesta.añadirDato(new GraficoCircular());

        return encuesta;
    }
}