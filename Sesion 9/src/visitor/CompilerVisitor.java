package visitor;

import nodos.*;
import nodos.sentencias.*;
import nodos.expresiones.*;

import java.util.HashMap;
import java.util.Map;

public class CompilerVisitor implements Visitor {
    private final Map<String, Integer> varDirs = new HashMap<>();

    public Object visit(Programa programa, Object param) {
        for (Sentencia sentencia : programa.sentencias)
            sentencia.accept(this, null);
        return null;
    }

    public Object visit(Read read, Object param) {
        read.var.accept(this, null);
        System.out.println("input\nstore");
        return null;
    }

    public Object visit(Asignacion asigna, Object param) {
        asigna.variable.accept(this, null);
        asigna.expr.accept(this, true);
        System.out.println("store");
        return null;
    }

    public Object visit(Print print, Object param) {
        print.expr.accept(this, true);
        System.out.println("output");
        return null;
    }

    public Object visit(ConstanteInt cte, Object param) {
        System.out.println("push " + cte.valor);
        return null;
    }

    public Object visit(Variable refVar, Object param) {
        if (!varDirs.containsKey(refVar.name))
            varDirs.put(refVar.name, varDirs.size()+1);
        System.out.println("push " + varDirs.get(refVar.name));
        if (param != null && param.equals(true))
            System.out.println("load");
        return null;
    }

    public Object visit(Suma suma, Object param) {
        suma.left.accept(this,  true);
        suma.right.accept(this, true);
        System.out.println("add");
        return null;
    }

    public Object visit(Producto prod, Object param) {
        prod.left.accept(this, true);
        prod.right.accept(this, true);
        System.out.println("mul");
        return null;
    }

    public Object visit(Division div, Object param) {
        div.left.accept(this, true);
        div.right.accept(this, true);
        System.out.println("div");
        return null;
    }
}

