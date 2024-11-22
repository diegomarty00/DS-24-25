package nodos.expresiones;

import nodos.Visitor;

public class Division implements Expresion {
    public Expresion left, right;

    public Division(Expresion left, Expresion right) {
        this.left = left;
        this.right = right;
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
