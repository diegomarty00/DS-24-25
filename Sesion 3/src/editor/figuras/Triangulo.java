package editor.figuras;

import editor.Point;
import java.io.PrintWriter;

public class Triangulo implements Figura{

    private Point v1;
    private Point v2;
    private Point v3;

    public Triangulo(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public void mover(int dx, int dy) {
        v1.setX(v1.getX() + dx);
        v1.setY(v1.getY() + dy);
        v2.setX(v2.getX() + dx);
        v2.setY(v2.getY() + dy);
        v3.setX(v3.getX() + dx);
        v3.setY(v3.getY() + dy);
    }

    @Override
	public boolean pulsar(int x, int y) 
	{
		return (x == v1.getX() && y == v1.getY()) ||
				   (x == v2.getX() && y == v2.getY()) ||
				   (x == v3.getX() && y == v3.getY());
	}

    @Override
    public void dibujar(PrintWriter output) {
       output.format("Triángulo: (%d, %d), (%d, %d), (%d, %d)", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
	}
}
