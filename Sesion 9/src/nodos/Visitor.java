package nodos;

import nodos.expresiones.*;
import nodos.sentencias.Asignacion;
import nodos.sentencias.Print;
import nodos.sentencias.Read;

public interface Visitor {

//    void visit(Programa programa);
//    void visit(ConstanteInt constanteInt);
//    void visit(Division division);
//    void visit(Producto producto);
//    void visit(Suma suma);
//    void visit(Variable variable);
//    void visit(Asignacion asignacion);
//    void visit(Print print);
//    void visit(Read read);

    Object visit(Programa programa, Object arg);
    Object visit(ConstanteInt constanteInt, Object arg);
    Object visit(Division division, Object arg);
    Object visit(Producto producto, Object arg);
    Object visit(Suma suma, Object arg);
    Object visit(Variable variable, Object arg);
    Object visit(Asignacion asignacion, Object arg);
    Object visit(Print print, Object arg);
    Object visit(Read read, Object arg);
}
