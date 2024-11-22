package pila;

import java.util.Scanner;

public class Pila {

    public int[] memoria = new int[1024];
    private int[] pila = new int[32];
    private int sp = 0;

    // $ Métodos Auxiliares --------------------------------
    public void push(int valor) {
        pila[sp] = valor;
        sp++;
    }

    public int pop() {
        sp--;
        return pila[sp];
    }

}
