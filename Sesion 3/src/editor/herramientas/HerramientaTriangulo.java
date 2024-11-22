package editor.herramientas;

import editor.Editor;
import editor.Point;
import editor.figuras.Triangulo;
import editor.figuras.Figura;

public class HerramientaTriangulo extends HerramientaCreacion{

	private int vertices;
	private Editor editor;
	private Point v1, v2, v3;

    public HerramientaTriangulo(Editor editor) {
        super(editor);
    }

    @Override
	public void pulsar(int x, int y) 
	{
		vertices++;
		if (vertices == 1) {
			editor.getDibujo().clearCurrentSelection();
			Point v1 = new Point(x, y);
		} else if (vertices == 2) {
			Point v2 = new Point(x, y);
		} else if (vertices == 3) {
			Point v3= new Point(x, y);
			Triangulo figura = new Triangulo(v1, v2, v3);
			editor.getDibujo().addFigura(figura);
			vertices = 0;
			editor.finHerramienta(figura);
		}		
	}

    @Override
	public void soltar()
	{
		vertices = 0;		
	}

	@Override
	protected Figura creaFigura(Point p1, Point p2) {
		return null;
	}

	@Override
	public String toString()
	{
		return "Herramienta de creación de triángulo";
	}

}
