package CH.ifa.draw.samples.nada;

import java.util.Vector;

import CH.ifa.draw.framework.Graphics;
import CH.ifa.draw.framework.Point;
import CH.ifa.draw.standard.AbstractFigure;
import CH.ifa.draw.standard.Rectangle;

public class EjemploFigura extends AbstractFigure{

	
	@Override
	public void basicDisplayBox(Point origin, Point corner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) { 
		g.setColor(java.awt.Color.WHITE); 
		g.fillRect(0,0,100,100); 
	} 
	
	@Override
	public Rectangle displayBox() { 
		return new Rectangle(0,0,100,100); 
	} 
	
	@Override
	public Vector handles() { 
		return new Vector(); 
	}

	@Override
	protected void basicMoveBy(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void basicDisplayBox(CH.ifa.draw.standard.Point origin, CH.ifa.draw.standard.Point corner) {
		// TODO Auto-generated method stub
		
	}

}
