package platform.playstation;

import platform.Image2D;
import platform.Plataforma;

import java.awt.*;

public class PlataformaPlaystation implements Plataforma {

    private Playstation5API play = new Playstation5API();

    @Override
    public Image2D loadImage(String nombre) {
        return play.loadGraphics(nombre);
    }

    @Override
    public void drawBall(int x, int y, Image2D image) {
        play.render(x, y, image);
    }

    @Override
    public Point getPosition() {
        return play.getJoystick();
    }
}
