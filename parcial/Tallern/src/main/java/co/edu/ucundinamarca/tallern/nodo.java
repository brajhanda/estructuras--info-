/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

public class nodo {

    public nodo(int d) {
        dato = d;
        siguiente = this;
    }
    int dato;
    nodo siguiente;

}
