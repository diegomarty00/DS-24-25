package editor.herramientas;

import editor.Editor;
import editor.Point;
import editor.figuras.Circulo;
import editor.figuras.Cuadrado;
import editor.figuras.Figura;

public class HerramientaCuadrado extends HerramientaCreacion{

    public HerramientaCuadrado(Editor editor) {
        super(editor);
    }

    @Override
    protected Figura creaFigura(Point p0, Point p1) {
        return new Cuadrado(p0, p1);
    }
    

    @Override
	public String toString()
	{
		return "Herramienta de creación de rectángulo";
	}
}
