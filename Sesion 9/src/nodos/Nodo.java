package nodos;

public interface Nodo {
    void accept(Visitor v);

    Object accept(Visitor v, Object arg);
}
