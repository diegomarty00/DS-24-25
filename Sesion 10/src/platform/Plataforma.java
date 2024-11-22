package platform;

import java.awt.*;

public interface Plataforma {
    public Image2D loadImage(String nombre);

    public void drawBall(int x, int y, Image2D image);

    public Point getPosition();
}
