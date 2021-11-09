/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author ZARAT
 */
public class DLDqueue implements inter {

    DNode cabeza, nodco;
    int size;

    public DLDqueue() {
        cabeza = new DNode();
        nodco = new DNode();
        cabeza.setNext(nodco);
        nodco.setPrev(cabeza);
        size = 0;
    }

    public void insertFirst(Object obj) {
        DNode h = cabeza;
        DNode node = new DNode();
        node.setVal(obj);
        node.setNext(h);
        h.setPrev(node);
        cabeza = node;
        if (size == 0) {
            nodco = node;
        }
        size++;

    }

    public void insertLast(Object obj) {
        DNode t = nodco;
        DNode node = new DNode();
        node.setVal(obj);
        node.setPrev(t);
        t.setNext(node);
        nodco = node;
        if (size == 0) {
            cabeza = node;
        }
        size++;
    }

    public Object removeFirst() {
        if (cabeza == null) {
            return null;
        }
        Object val = cabeza.getVal();
        cabeza = cabeza.getNext();
        size--;
        return val;
    }

    public Object removeLast() {
        if (nodco == null) {
            return null;
        }
        Object val = nodco.getVal();
        nodco = nodco.getPrev();
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String s = "head [";
        DNode aux = cabeza;
        for (int i = 0; i < size; i++) {
            s += aux.getVal();
            if (aux == nodco) {
                break;
            }
            s += "-";
            aux = aux.getNext();
        }
        return s + "] tail";
    }

}
