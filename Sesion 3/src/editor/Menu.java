package editor;

import java.io.*;

import editor.Editor;
import editor.herramientas.*;

public class Menu {
    private Editor editor;
    private BufferedReader input;
    private PrintWriter output;
    private boolean exit = false;

    private Herramienta selection, cuadrado, circulo, triangulo;

    public Menu(Editor editor) {
        this(editor, System.in, System.out);
    }

    public Menu(Editor editor, InputStream input, PrintStream output) {
        this(editor, new BufferedReader(new InputStreamReader(input)), new PrintWriter(output, true));
    }

    public Menu(Editor editor, BufferedReader input, PrintWriter output) {
        this.editor = editor;
        this.input = input;
        this.output = output;
        selection = new HerramientaSeleccion(editor);
        cuadrado = new HerramientaCuadrado(editor);
        circulo = new HerramientaCirculo(editor);
        triangulo = new HerramientaTriangulo(editor);
    }

    public void run() throws IOException {
        showHelp();
        while (!exit) {
            askUser();
        }
        output.println("¡Adios!");
        return;
    }

    private void showHelp() {
        output.println("");
        output.println("Comandos de Herramientas: cuadrado | circulo | triangulo | seleccion");
        output.println("Comandos de Ratón: pinchar x,y | mover x,y | soltar x,y");
        output.println("Comandos de memoria: undo | redo");
        output.println("Otros Comandos: ayuda | dibujar | exit");
        output.println("-----------------------------------------------------------");
    }


    private void askUser() throws IOException {
        output.print("> ");
        output.flush();
        String[] tokens = input.readLine().split("[ ]", 2);
        String action = tokens[0];

        // En primer lugar, las acciones que requieren parámetros
        if (action.equals("pinchar") || action.equals("mover")) {
            try {
                // La siguiente  línea es para que funcione independientemente de si las coordenadas
                // están separadas sólo por una coma o si hay espacios entre los números y la coma
                String[] arguments = tokens[1].split("\\s*,\\s*");
                int x = Integer.parseInt(arguments[0]);
                int y = Integer.parseInt(arguments[1]);
                if (action.equals("pinchar"))
                    editor.pulsar(x, y);
                else if (action.equals("mover"))
                    editor.mover(x, y);
                else
                    throw new AssertionError("¡Sólo puede ser pulsar o mover!");
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                output.printf("Error de sintaxis: faltan las coordenadas: %s <x>, <y>%n", action);
            }
            return;
        }

        // Para el resto de las acciones, que no requieren parámetros, comprueba
        // que efectivamente no se les pase ninguno (por usabilidad, para que el
        // usuario se dé cuenta de que la última acción no funciona como él esperaba).
        // Por ejemplo, si por equivocación tecleó:
        //
        // 		"soltar 200, 345"
        //
        // cuando realmente esas coordenadas no son tenidas en cuenta (se debería haber
        // llamado previamente a "mover 200, 345" y luego simplemente "soltar").
        //
        if (tokens.length > 1) {
            output.printf("Error de sintaxis: \"%s\" no tiene parámetros%n", action);
            return;
        }

        if (action.equals("soltar")) {
            editor.soltar();
        } else if (action.equals("dibujar")) {
            editor.dibujar();
        } else if (action.equals("ayuda")) {
            showHelp();
        } else if (action.equals("salir")) {
            exit = true;
        } else if (action.equals("undo")) {
            editor.undo();
        } else if (action.equals("redo")) {
            editor.redo();
        } else if (action.equals("seleccion")) {
            editor.cambioHerramienta(selection);
        } else if (action.equals("cuadrado")) {
            editor.cambioHerramienta(cuadrado);
        } else if (action.equals("circulo")) {
            editor.cambioHerramienta(circulo);
        } else if (action.equals("triangulo")) {
            editor.cambioHerramienta(triangulo);
        } else {
            output.println("Acción desconocida");
            showHelp();
        }
    }
}