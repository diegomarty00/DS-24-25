package editor.herramientas;

import editor.Editor;
import editor.figuras.Figura;

public class HerramientaSeleccion implements Herramienta {
    private Editor editor;
    private Figura figuraPulsada;
	private int x, y;

    public HerramientaSeleccion(Editor editor)
	{
		if (editor == null)
			throw new IllegalArgumentException("La herramienta de selección necesita una referencia al editor");
		this.editor = editor;
	}

    @Override
	public void pulsar(int x, int y)
	{
		figuraPulsada = editor.getDibujo().encontrarFigura(x, y);
		setPosition(x, y);
	}

	private void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;		
	}

	@Override
	public void mover(int x, int y) 
	{
		if (figuraPulsada == null) {
			return;
		}
		figuraPulsada.mover(x - this.x, y - this.y);
		setPosition(x, y);
	}

	@Override
	public void soltar()
	{
		figuraPulsada = null;		
	}
	
	@Override
	public String toString()
	{
		return "Herramienta de selección";
	}
}
