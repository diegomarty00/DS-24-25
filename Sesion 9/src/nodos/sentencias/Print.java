package nodos.sentencias;

import nodos.Visitor;
import nodos.expresiones.Expresion;

public class Print implements Sentencia {
    public Expresion expr;

    public Print(Expresion expr) {
        this.expr = expr;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Object accept(Visitor v, Object arg) {
        return v.visit(this, arg);
    }
}
