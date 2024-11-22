package editor;

import editor.figuras.Figura;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private PrintWriter output;
    List<Figura> figuras = new ArrayList<Figura>();
    int size = 0;
    int maxSize = 0;

    public Memoria(PrintWriter output) {
        this.output = output;
    }

    public List<Figura> undo() {
        if (size == 0)
            output.println("No se puede deshacer nada");
        else
            size--;
        return lista();

    }

    private List<Figura> lista() {
        List<Figura> lista = new ArrayList<Figura>();
        for (int i=0; i < size; i++)
            lista.add(figuras.get(i));
        return lista;
    }

    public List<Figura> redo() {
        if (size >= maxSize)
            output.println("No se puede recuperar nada");
        else
            size++;
        return lista();
    }

    public void addFigura(Figura figura) {
        this.figuras.add(figura);
        size++;
        maxSize++;
    }
}
