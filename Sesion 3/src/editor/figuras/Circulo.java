package editor.figuras;

import editor.Point;

import java.io.PrintWriter;

public class Circulo implements Figura{

    private Point centro;
    private int radio;

    public Circulo(Point centro, int radio){
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public void mover(int dx, int dy) {
        centro.setX(centro.getX() + dx);
        centro.setY(centro.getY() + dy);
    }

    @Override
	public boolean pulsar(int x, int y) 
	{
		double distancia = Math.sqrt(Math.pow(x - centro.getX(), 2) + Math.pow(y - centro.getY(), 2));
		return distancia < this.radio;
	}

    @Override
    public void dibujar(PrintWriter output)  {
        output.println("Círculo: centro = "+centro+", radio = "+radio);
    }
}
