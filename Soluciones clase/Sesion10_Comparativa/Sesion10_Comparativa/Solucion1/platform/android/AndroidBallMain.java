/**
 * # IMPORTANTE: El código entregado para esta práctica es el mínimo necesario para entender
 * el ejercicio y NUNCA debería ser tomado como un ejemplo del uso adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha omitido
 * a propósito para simplificar el planteamiento del ejercicio.
 */

package platform.android;

import game.BallGame;

public class AndroidBallMain {

    public static void main(String[] args) {

        BallGame game = new BallGame(new AndroidAdapter());

        game.play();
    }

}
