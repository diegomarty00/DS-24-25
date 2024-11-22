package editor.herramientas;

import editor.Editor;
import editor.Point;
import editor.figuras.Circulo;
import editor.figuras.Figura;

public class HerramientaCirculo extends HerramientaCreacion{

    public HerramientaCirculo(Editor editor) {
        super(editor);
    }

    @Override
    protected Figura creaFigura(Point p0, Point p1) {
        Point centro = new Point((p0.getX() + p1.getX()) / 2, (p0.getY() + p1.getY()) / 2);
        int radio = Math.max(p0.getX() - p1.getX(), p0.getY() - p1.getY()) / 2;

        return new Circulo(centro, radio);
    }

    @Override
	public String toString()
	{
		return "Herramienta de creación de círculo";
	}
}
