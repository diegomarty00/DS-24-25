package editor.core;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import editor.herramientas.HerramientaSeleccion;


public class Editor {
    private Dibujo dibujo;

    private Map<String,Herramienta> herramientas = new HashMap<>();
    private Herramienta actual, defaultTool;

    public Editor() {
        setDibujo(new Dibujo());

        actual = defaultTool = createDefaultTool();
    }

    public void registerHerramienta(String orden, Herramienta herramienta) {
        herramientas.put(orden, herramienta);
    }

    protected Herramienta createDefaultTool() {
        Herramienta seleccion = new HerramientaSeleccion(this);
        herramientas.put("seleccion", seleccion);
        return seleccion;
    }

    public void run() throws IOException {

        System.out.println("Comandos de Herramientas: cuadrado | circulo | triangulo | seleccion");
        System.out.println("Comandos de Ratón: pinchar x,y | mover x,y | soltar x,y");
        System.out.println("Otros Comandos: dibujar | exit");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(">");
            String[] line = in.readLine().split("[ ,]");

            if (line[0].equals("exit"))
                return;


            if (line[0].equals("pinchar"))
                actual.pinchar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
            else if (line[0].equals("mover"))
                actual.mover(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
            else if (line[0].equals("soltar"))
                actual.soltar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
            else if (line[0].equals("dibujar"))
                dibujar();
            else if (line[0].equals("undo"))
                dibujo.getHistorial().undo();
            else if (line[0].equals("redo"))
                dibujo.getHistorial().redo();
            else if (herramientas.containsKey(line[0]))
                setHerramienta(herramientas.get(line[0]));
            else
                System.out.println("Comando no válido");

        } while (true);
    }

    //$ Métodos del dibujo -----------------------------

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public Dibujo getDibujo() {
        return dibujo;
    }

    public void dibujar() {
        System.out.println("Herramienta: " + actual);
        dibujo.dibuja();
    }

    //$ Métodos de Herramientas ---------------------

    public void setHerramienta(Herramienta herramienta) {
        this.actual = herramienta;
    }

    public Herramienta getDefaultTool() {
        return defaultTool;
    }

    public void finHerramienta() {
        actual = getDefaultTool();
    }
    public void anadeCambio(Cambio cambio) {
        dibujo.getHistorial().anadeCambio(cambio);
    }
}
