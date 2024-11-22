package nodos.sentencias;

import nodos.Visitor;
import nodos.expresiones.Expresion;
import nodos.expresiones.Variable;

public class Asignacion implements Sentencia {
    public Variable variable;
    public Expresion expr;

    public Asignacion(Variable variable, Expresion expr) {
        this.variable = variable;
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
