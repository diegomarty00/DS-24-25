package pila.instructions;
import pila.*;

public class MulInstruction implements Instruction{

    @Override
    public void action(Pila pila, Ip ip) {
        pila.push(pila.pop() * pila.pop());
        ip.increment();
    }
}
