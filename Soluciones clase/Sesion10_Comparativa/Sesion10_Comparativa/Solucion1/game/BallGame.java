package game;

import java.awt.Point;

import platform.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas sin tener que cambiar el código para cada una
 */

public class BallGame {
    public BallGame(PlatformAdapter platform) {
        this.platform = platform;
    }

    public void play() {
        Image2D image = platform.load("Bola.jpg");
        // Lógica principal del juego
        for (int i = 0; i < 10; i++) {
            Point point = platform.getPosition();
            // Comprobar colisiones...
            // Imprimir marcador...
            // Otra lógica del juego...
            platform.show(point.x, point.y, image);
        }
    }

    private PlatformAdapter platform;
}
