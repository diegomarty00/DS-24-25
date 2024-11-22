package pila;

import pila.instructions.*;

import java.util.ArrayList;
import java.util.List;

public class Interprete {

    private Pila pila = new Pila();
    private List<Instruction> instrucciones = new ArrayList<Instruction>();
    private Ip ip = new Ip();

    // $ Cargar programa --------------------------------
    public void cargaInstruccion(String linea) {
        if (linea.trim().length() == 0)
            return;

        String[] palabras = linea.split(" ");
        instrucciones.add(createInstruction(palabras));
    }

    private Instruction createInstruction(String[] palabras) {
        if (palabras[0].equals("add"))
            return new AddInstruction();
        if (palabras[0].equals("input"))
            return new InputInstruction();
        if (palabras[0].equals("jmpg"))
            return new JmpgInstruction(palabras[1]);
        if (palabras[0].equals("jmp"))
            return new JmpInstruction(palabras[1]);
        if (palabras[0].equals("load"))
            return new LoadInstruction();
        if (palabras[0].equals("mul"))
            return new MulInstruction();
        if (palabras[0].equals("output"))
            return new OutputInstruction();
        if (palabras[0].equals("push"))
            return new PushInstruction(palabras[1]);
        if (palabras[0].equals("store"))
            return new StoreInstruction();
        if (palabras[0].equals("sub"))
            return new SubInstruction();
        return new ErrorInstruction();
    }

    // $ Motor de Ejecución --------------------------------
    private void ejecutaPrograma() {
        while (ip.getPos() < instrucciones.size()) {
            Instruction instruction = instrucciones.get(ip.getPos());
            instruction.action(pila, ip);
        }
    }
}
