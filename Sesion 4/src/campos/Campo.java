package campos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Campo {
    private String etiqueta;
    BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
    private String texto;
    private Campo campo;

    private Campo (Campo campo, String etiqueta){
        this.etiqueta = etiqueta;
        this.campo = campo;
    }

    private Campo (Campo campo){
        this.campo = campo;
    }

    public Campo(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void pideDato() {
        boolean valido1, valido2;
        do {
            valido1 = valido2 = true;
            try {
                System.out.print(etiqueta + ": ");
                texto = consola.readLine();

                if (campo != null) {
                    valido1 = campo.condicion();
                }
                valido2 = condicion();

            } catch (IOException ex) {
                System.out.println(ex);
            }
        } while (!valido1 && !valido2);
    }

    protected abstract boolean condicion();

    public String getDato() {
        return texto;
    }


}

