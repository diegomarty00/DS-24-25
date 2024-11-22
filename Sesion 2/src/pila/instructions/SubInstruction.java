package pila.instructions;
import pila.*;

public class SubInstruction implements Instruction{
    @Override
    public void action(Pila pila, Ip ip) {
        int b = pila.pop();
        int a = pila.pop();
        pila.push(a - b);
        ip.increment();
    }
}
