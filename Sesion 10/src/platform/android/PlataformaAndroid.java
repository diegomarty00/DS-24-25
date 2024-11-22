package platform.android;

import platform.Image2D;
import platform.Plataforma;


import java.awt.*;

public class PlataformaAndroid implements Plataforma{

    private AndroidAPI android = new AndroidAPI();

    @Override
    public Image2D loadImage(String nombre) {
        return android.loadResource(nombre);
    }

    @Override
    public void drawBall(int x, int y, Image2D image) {
        android.draw(x, y, image);
    }

    @Override
    public Point getPosition() {
        return android.getTouch();
    }
}
