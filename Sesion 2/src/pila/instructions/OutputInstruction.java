package pila.instructions;
import pila.*;

public class OutputInstruction implements Instruction{

    @Override
    public void action(Pila pila, Ip ip) {
        System.out.println(pila.pop());
        ip.increment();
    }
}
