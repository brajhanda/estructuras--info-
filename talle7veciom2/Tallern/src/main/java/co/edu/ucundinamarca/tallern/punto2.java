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
public class punto2 {

    class Nodo {

        Object objet;
        Nodo siguiente;

        public Nodo(Object o) {
            objet = o;
            siguiente = null;
        }
    }

    Nodo fin;
    int size;

    public punto2() {
        fin = null;
        size = 0;
    }

    public void push(Object o) {
        Nodo new_Nodo = new Nodo(o);
        if (fin == null) {
            fin = new_Nodo;
        } else {
            new_Nodo.siguiente = fin;
            fin = new_Nodo;
        }
        size++;
    }

    ; 

  public Object pop() {
        if (fin == null) {
            return null;
        }
        ;
        Object o = fin.objet;
        fin = fin.siguiente;
        size--;
        return o;
    }

    public boolean isEmpty() {

        return (size == 0);
    }

    public int size() {

        return size;
    }

    public Object end() {

        if (fin == null) {
            return null;
        } else {
            return fin.objet;
        }
    }

}
