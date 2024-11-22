package visitor;

import nodos.Programa;
import nodos.Visitor;
import nodos.expresiones.*;
import nodos.sentencias.Asignacion;
import nodos.sentencias.Print;
import nodos.sentencias.Read;
import nodos.sentencias.Sentencia;

public class PrintVisitor implements Visitor {

//    @Override
//    public void visit(Programa programa) {
//        for (Sentencia sentencia : programa.sentencias)
//            sentencia.accept(this);
//    }
//
//    @Override
//    public void visit(ConstanteInt constanteInt) {
//        System.out.print(constanteInt.valor);
//    }
//
//    @Override
//    public void visit(Division division) {
//        division.left.accept(this);
//        System.out.print(" / ");
//        division.right.accept(this);
//    }
//
//    @Override
//    public void visit(Producto producto) {
//        producto.left.accept(this);
//        System.out.print(" * ");
//        producto.right.accept(this);
//    }
//
//    @Override
//    public void visit(Suma suma) {
//        suma.left.accept(this);
//        System.out.print(" + ");
//        suma.right.accept(this);
//    }
//
//    @Override
//    public void visit(Variable variable) {
//        System.out.print(variable.name);
//    }
//
//    @Override
//    public void visit(Asignacion asignacion) {
//        asignacion.variable.accept(this);
//        System.out.print(" = ");
//        asignacion.expr.accept(this);
//        System.out.println(";");
//    }
//
//    @Override
//    public void visit(Print print) {
//        System.out.print("print ");
//        print.expr.accept(this);
//        System.out.println(";");
//    }
//
//    @Override
//    public void visit(Read read) {
//        System.out.print("read ");
//        read.var.accept(this);
//        System.out.println(";");
//    }

    //====================================================================
    //========================== SEGUNDA  PARTE ==========================
    //====================================================================


    @Override
    public Object visit(Programa programa, Object arg) {
        for (Sentencia sentencia : programa.sentencias)
            sentencia.accept(this, arg);
        return null;
    }

    @Override
    public Object visit(ConstanteInt constanteInt, Object arg) {
        System.out.print(constanteInt.valor);
        return null;
    }

    @Override
    public Object visit(Division division, Object arg) {
        division.left.accept(this, arg);
        System.out.print(" / ");
        division.right.accept(this, arg);
        return null;
    }

    @Override
    public Object visit(Producto producto, Object arg) {
        producto.left.accept(this, arg);
        System.out.print(" * ");
        producto.right.accept(this, arg);
        return null;
    }

    @Override
    public Object visit(Suma suma, Object arg) {
        suma.left.accept(this, arg);
        System.out.print(" + ");
        suma.right.accept(this, arg);
        return null;
    }

    @Override
    public Object visit(Variable variable, Object arg) {
        System.out.print(variable.name);
        return null;
    }

    @Override
    public Object visit(Asignacion asignacion, Object arg) {
        asignacion.variable.accept(this, arg);
        System.out.print(" = ");
        asignacion.expr.accept(this, arg);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Print print, Object arg) {
        System.out.print("print ");
        print.expr.accept(this, arg);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Read read, Object arg) {
        System.out.print("read ");
        read.var.accept(this, arg);
        System.out.println(";");
        return null;
    }
}
