package platform.windows;

import platform.Image2D;
import platform.Plataforma;

import java.awt.*;

public class PlataformaWindows implements Plataforma {

    private WindowsAPI windows = new WindowsAPI();

    @Override
    public Image2D loadImage(String nombre) {
        return windows.loadFile(nombre);
    }

    @Override
    public void drawBall(int x, int y, Image2D image) {
        windows.paint(x, y, image);
    }

    @Override
    public Point getPosition() {
        return windows.getMouseClick();
    }
}
