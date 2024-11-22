package editor;

import editor.figuras.Figura;
import editor.herramientas.Herramienta;
import editor.herramientas.HerramientaSeleccion;

import javax.swing.*;
import java.io.*;

public class Editor {
    private Dibujo dibujo = new Dibujo();
	private Memoria memoria;
	private PrintWriter output;
    private Herramienta herramienta;
	private Herramienta defecto;

    public Editor(){
		this(System.out);
	}
	
	public Editor(PrintStream out)
	{
		output = new PrintWriter(out, true);
		defecto = new HerramientaSeleccion(this);
		memoria = new Memoria(output);
	}


    // Métodos del dibujo -----------------------------

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public Dibujo getDibujo() {
        return dibujo;
    }

    public void dibujar() {
        output.println("Herramienta seleccionada: " + herramienta);
        dibujo.dibujar(output);
    }

    // Métodos de herramientas --------------------------
    public void cambioHerramienta(Herramienta herramienta)
	{
		if (herramienta == null)
			throw new IllegalArgumentException("¡No se puede seleccionar una herramienta nula!");
		this.herramienta.soltar(); 
		this.herramienta = herramienta;
	}

    public void pulsar(int x, int y)
	{
		herramienta.pulsar(x, y);
	}
	
	public void mover(int x, int y)
	{
		herramienta.mover(x, y);
	}
	
	public void soltar()
	{
		herramienta.soltar();
	}

	public void finHerramienta(Figura figura) {
		this.herramienta = defecto;
		memoria.addFigura(figura);
	}

	public void undo() {
		this.dibujo.cambiarRegistro(memoria.undo());
	}

	public void redo() {
		this.dibujo.cambiarRegistro(memoria.redo());
	}
}
