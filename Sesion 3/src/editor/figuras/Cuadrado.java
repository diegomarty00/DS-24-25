package editor.figuras;

import editor.Point;
import java.io.PrintWriter;

public class Cuadrado implements Figura{

    private int x0;
    private int y0;
    private int ancho;
    private int alto;

    public Cuadrado(Point p0, Point p1){
        x0 = p0.getX();
        y0 = p0.getY();
        ancho = p1.getX()-p0.getX();
        alto = p1.getY()-p0.getY();
    }

    @Override
    public void mover(int dx, int dy) {
        x0 += dx;
        y0 += dy;
    }

    @Override
	public boolean pulsar(int x, int y) 
	{
		return this.x0 <= x && x <= this.x0 + ancho &&
				this.y0 <= y && y <= this.y0 + alto;
		
	}

    @Override
    public void dibujar(PrintWriter output) {
        output.println("Cuadrado: x = "+x0+", y = "+y0+", ancho = "+ancho+", alto = "+alto);
    }
}
