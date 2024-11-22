package pila;

public class Ip {
    private int pos;

    public Ip() {
        this.pos = 0;
    }

    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }

    public void increment(){
        this.pos++;
    }
}
