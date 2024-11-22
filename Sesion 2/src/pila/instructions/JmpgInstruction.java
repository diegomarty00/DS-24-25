package pila.instructions;
import pila.*;

public class JmpgInstruction implements Instruction{
    private final String valor;

    public JmpgInstruction(String valor) {
        this.valor = valor;
    }

    @Override
    public void action(Pila pila, Ip ip) {
        int b = pila.pop();
        int a = pila.pop();
        if (a > b)
            ip.setPos(Integer.parseInt(valor));
        else
            ip.increment();
    }
}
