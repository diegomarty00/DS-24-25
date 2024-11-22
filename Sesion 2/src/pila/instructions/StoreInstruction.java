package pila.instructions;
import pila.*;

public class StoreInstruction implements Instruction{
    @Override
    public void action(Pila pila, Ip ip) {
        int valor = pila.pop();
        int direccion = pila.pop();
        pila.memoria[direccion] = valor;
        ip.increment();
    }
}
