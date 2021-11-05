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
/*
 * LinkedStack.java
 *
 */

public class punto2 {

  class Node {
    Object elem;
    Node Next;

    public Node(Object o) {
      elem = o;
      Next = null;
    }
  }

  Node end;
  int size;

  public punto2() {
    end = null;
    size = 0;
  }

  public void push(Object o) {
    Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++;
  }; // inserts an object onto the stack

  public Object pop() {
    if (end == null)
      return null;
    ;
    Object o = end.elem;
    end = end.Next;
    size--;
    return o;
  }// Gets the object from the stack

  public boolean isEmpty() {

    return (size == 0);
  }

  public int size() {

    return size;
  }

  public Object end() {

    if (end == null)
      return null;
    else
      return end.elem;
  }

} // class LinkedStack