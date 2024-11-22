package pila.instructions;
import pila.*;

public class JmpInstruction implements Instruction{
    private final String valor;


    public JmpInstruction(String valor) {
        this.valor = valor;
    }
    @Override
    public void action(Pila pila, Ip ip) {
        ip.setPos(Integer.parseInt(valor));
    }
}
