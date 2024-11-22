package pila.instructions;
import pila.*;

public class LoadInstruction implements Instruction{

    @Override
    public void action(Pila pila, Ip ip) {
        int direccion = pila.pop();
        pila.push(pila.memoria[direccion]);
        ip.increment();
    }
}
