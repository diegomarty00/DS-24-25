package pila.instructions;

import pila.*;
import java.util.Scanner;

public interface Instruction {
    Scanner console = new Scanner(System.in);
    void action(Pila pila, Ip ip);
}
