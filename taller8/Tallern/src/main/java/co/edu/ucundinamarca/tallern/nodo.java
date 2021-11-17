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
public class nodo {

    private nodo padre;
    private nodo hijoderecho;
    private nodo hijoizquierdo;
    private int llave;
    private Object value;

    /**
     *
     * @param key
     * @param valor
     */
    public nodo(int key, Object valor) {
        this.padre = null;
        this.hijoderecho = null;
        this.llave = key;
        this.value = valor;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "la llave es" + "u su valor es" + value;
    }

    public nodo getpadre() {
        return padre;
    }

    public void setpadre(nodo padre) {
        this.padre = padre;
    }

    public nodo gethijoderecho() {
        return hijoderecho;
    }

    public void sethijoderecho(nodo hijoderecho) {
        this.hijoderecho = hijoderecho;
    }

    public nodo gethijoizquierdo() {
        return hijoizquierdo;
    }

    public void sethijoizquierdo(nodo hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public int getllave() {
        return llave;
    }

    public void setllave(int llave) {
        this.llave = llave;
    }

    public Object getvalue() {
        return value;
    }

    public void setvalue(Object value) {
        this.value = value;
    }
}
