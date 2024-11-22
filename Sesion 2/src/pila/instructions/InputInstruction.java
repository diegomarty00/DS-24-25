package pila.instructions;
import pila.*;

public class InputInstruction implements Instruction{

    @Override
    public void action(Pila pila, Ip ip) {
        System.out.println("Escriba un entero:");
        pila.push(console.nextInt());
        ip.increment();
    }
}
