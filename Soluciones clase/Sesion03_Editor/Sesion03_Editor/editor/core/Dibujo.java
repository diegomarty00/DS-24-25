package editor.core;

import java.util.*;

public class Dibujo {
    public void addFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibuja() {
        for (Figura figura : figuras)
            figura.dibujar();
    }

    public Figura getFigura(int x, int y) {
        for (Figura figura : figuras)
            if (figura.contiene(x, y))
                return figura;
        return null;
    }

    public void removeFigura(Figura figura) {
        figuras.remove(figura);
    }

    List<Figura> figuras = new ArrayList<>();
}
