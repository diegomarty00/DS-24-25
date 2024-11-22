package editor;

import editor.figuras.Figura;

import java.io.PrintWriter;
import java.util.*;

public class Dibujo {

	private List<Figura> figuras = new ArrayList<Figura>();
	private Figura currentSelection;
	
	public void addFigura(Figura figura) {
		if (figura == null)
			throw new IllegalArgumentException("¡No se puede añadir una figura nula!");
		figuras.add(figura);
		clearCurrentSelection();
		setCurrentSelection(figura);
	}


	public void dibujar(PrintWriter output) {
		if (figuras.isEmpty())
			return;
		output.println("Figuras: ");
		for (Figura figura : figuras) {
			output.print(" - ");
			figura.dibujar(output);
			if (figura == currentSelection)
				output.print(" (*)");
			output.println();
		}
	}

	public Figura encontrarFigura(int x, int y)
	{
		for (Figura figura : figuras) {
			if (figura.pulsar(x, y))
				return figura;
		}
		return null;
	}
	

	public void setCurrentSelection(Figura figura)
	{
		if (!figuras.contains(figura))
			throw new IllegalArgumentException("¡No se puede seleccionar una figura que no existe en el documento!: " + figura);
		currentSelection = figura;
	}

	protected void cambiarRegistro(List<Figura> figuras){
		this.figuras = figuras;
	}

	protected List<Figura> getFiguras(){
		return this.figuras;
	}
	
	public Figura getCurrentSelection()
	{
		return currentSelection;
	}
	
	public void clearCurrentSelection()
	{
		currentSelection = null;
	}

}
