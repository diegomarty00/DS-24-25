package nodos.sentencias;

import nodos.Visitor;
import nodos.expresiones.Variable;

public class Read implements Sentencia {
    public Variable var;

    public Read(Variable var) {
        this.var = var;
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
