package pila.instructions;
import pila.*;

public class ErrorInstruction implements Instruction{
    @Override
    public void action(Pila pila, Ip ip) {
        System.out.println("Error instruction");
    }
}
