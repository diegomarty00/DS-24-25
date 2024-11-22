package editor.figuras;

import java.io.PrintWriter;

public interface Figura {

    public void mover(int dx, int dy);
    boolean pulsar(int x, int y);
    public void dibujar(PrintWriter output);
}
