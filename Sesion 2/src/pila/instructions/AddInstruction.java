package pila.instructions;
import pila.*;

public class AddInstruction implements Instruction {
    @Override
    public void action(Pila pila, Ip ip) {
        pila.push(pila.pop() + pila.pop());
        ip.increment();
    }
}
