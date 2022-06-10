package co.edu.escuelaing;

import java.util.Iterator;

public class LinkList implements Iterable<Float> {
    private Nodo head;
    private Nodo tail;
    private int tamano;

    public LinkList() {
        this.tamano = 0;
    }

    public void insert(float numero) {
        Nodo cabeza = new Nodo(numero, null);
        this.tamano++;

        if (head == null) {
            this.head = cabeza;
            this.tail = cabeza;
        } else {
            this.tail.setTail(cabeza);
        }
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public Iterator<Float> iterator() {
        Iterator<Float> iterator = new Iterator<Float>() {
            private Nodo iterado;

            @Override
            public boolean hasNext() {
                if (iterado == null) {
                    return (false);
                } else {
                    return (true);
                }
            }

            @Override
            public Float next() {
                if (iterado == null) {
                    iterado = head;
                } else {
                    iterado = iterado.getTail();
                }
                return iterado.getNumero();
            }
        };
        return iterator;
    }
}
