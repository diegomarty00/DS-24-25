package nodos;

import nodos.sentencias.Sentencia;

import java.util.*;

public class Programa implements Nodo {
    public List<Sentencia> sentencias;

    public Programa(List<Sentencia> sentencias) {
        this.sentencias = sentencias;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Object accept(Visitor v, Object arg) {
        v.visit(this, arg);
        return null;
    }
}
