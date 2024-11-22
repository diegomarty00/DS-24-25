package nodos.expresiones;

import nodos.Visitor;

public class Variable implements Expresion {
    public String name;

    public Variable(String name) {
        this.name = name;
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
