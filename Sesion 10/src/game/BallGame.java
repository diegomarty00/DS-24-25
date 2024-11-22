package game;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import platform.*;
import platform.android.*;
import platform.playstation.*;
import platform.windows.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas
 */


public class BallGame {
    protected Plataforma plataforma;

    public BallGame() throws IOException {
        solicitarPlataforma();

    }

    private void solicitarPlataforma() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Que tipo de plataforma vas a usar:");
        System.out.println("Android: 'a' || Playstation: 'p' || Windows: 'w'");
        String tokens = input.readLine();

        if (tokens.equals("a")) {
            plataforma = new PlataformaAndroid();
        }

        if (tokens.equals("p")) {
            plataforma = new PlataformaPlaystation();
        }

        if (tokens.equals("w")) {
            plataforma = new PlataformaWindows();
        }

        setAPI(plataforma);
    }

    public BallGame(Plataforma plataforma) {
        setAPI(plataforma);
    }

    public void start() {
        Image2D image = loadImage("Bola.jpg");

        // Lógica principal del juego
        for (int i = 0; i < 10; i++) {
            Point point = getPosition();
            // Comprobar colisiones...
            // Imprimir marcador...
            // Otra lógica del juego...
            drawBall(image, point);
        }
    }

    private void setAPI(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    private Image2D loadImage(String file) {
        return this.plataforma.loadImage(file);
    }

    private void drawBall(Image2D image, Point point) {
        this.plataforma.drawBall(point.x, point.y, image);
    }

    private Point getPosition() {
        return this.plataforma.getPosition();
    }
}
