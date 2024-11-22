package pila.instructions;
import pila.*;

public class PushInstruction implements Instruction{
    private final String valor;

    public PushInstruction(String valor) {
        this.valor = valor;
    }
    @Override
    public void action(Pila pila, Ip ip) {
        pila.push(Integer.parseInt(valor));
        ip.increment();
    }
}
