package nodos.expresiones;

import nodos.Visitor;

public class ConstanteInt implements Expresion {
    public String valor;

    public ConstanteInt(String valor) {
        this.valor = valor;
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
