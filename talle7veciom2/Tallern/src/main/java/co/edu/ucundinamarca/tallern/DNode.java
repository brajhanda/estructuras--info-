/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;


public class DNode {

  DNode siguiente, antes;
  Object val;

  public DNode() {

    this.siguiente = null;
    this.antes = null;
    this.val = null;
  }

  public DNode(Object val, DNode first, DNode last) {

    this.siguiente = first;
    this.antes = last;
    this.val = val;
  }

  public DNode getNext() {
    return siguiente;
  }

  public void setNext(DNode next) {
    this.siguiente = next;
  }

  public DNode getPrev() {
    return antes;
  }

  public void setPrev(DNode prev) {
    this.antes = prev;
  }

  public Object getVal() {
    return val;
  }

  public void setVal(Object val) {
    this.val = val;
  }

}

