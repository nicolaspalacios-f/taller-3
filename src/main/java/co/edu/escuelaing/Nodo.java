package co.edu.escuelaing;

public class Nodo {
    private Float numero;
    private Nodo tail;

    public Nodo(float numero, Nodo tail) {
        this.numero = numero;
        this.tail = tail;
    }

    public Float getNumero() {
        return numero;
    }

    public void setNumero(Float numero) {
        this.numero = numero;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }
}
