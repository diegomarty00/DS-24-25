package editor.herramientas;

import editor.Editor;
import editor.Point;
import editor.figuras.Figura;

public abstract class HerramientaCreacion implements Herramienta {

    private Editor editor;
    private Point inicio;
    private Point fin;

    public HerramientaCreacion(Editor editor) {
        if (editor == null)
			throw new IllegalArgumentException("Las herramientas de creación necesitan una referencia (no nula) al editor");
        this.editor = editor;
    }

    public void pulsar(int x, int y) {
        editor.getDibujo().clearCurrentSelection();
        inicio = new Point(x, y);
    }

    public void mover(int x, int y) {
        if (fin == null) {
			fin = new Point(0, 0);
		}
        fin.setX(x);
        fin.setY(y);
	}

    public void soltar() {
        Figura figura = creaFigura(inicio, fin);
        editor.getDibujo().addFigura(figura);
        editor.finHerramienta(figura);
    }

    protected abstract Figura creaFigura(Point p1, Point p2);

}
