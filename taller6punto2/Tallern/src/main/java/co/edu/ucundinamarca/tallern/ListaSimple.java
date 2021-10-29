/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

/**
 *
 * @author ZARAT
 */
public class ListaSimple {
	nodo primero;
        nodo ultimo;
        Scanner teclado = new Scanner(System.in);
    public  ListaSimple(){
        primero = null;
        ultimo = null;
    }
           public void ingresarNodo(int dato){
               nodo nodoNuevo = new nodo();
               nodoNuevo.dato = dato;
               if (primero == null){
                   primero = nodoNuevo;
                   primero.siguiente = null;
                   ultimo = nodoNuevo;
               }else{
                   ultimo.siguiente =nodoNuevo;
                   nodoNuevo.siguiente = null;
                   ultimo = nodoNuevo;
                   
               }
               }
           
           public void buscarNodo(int dato){
               nodo actual =new nodo();
                actual = primero;
                while(actual != null){
                    if (actual.dato == dato){
                      System.out.println("encontrado");   
                    }
                    actual = actual.siguiente;
                }
           }
            public void modificarNodo(int dato){
              nodo actual = new nodo();
              actual = primero;
                  while(actual != null){
                      if (actual.dato == dato){
                      System.out.println("ingrese nuevos datos");
                      actual.dato = teclado.nextInt();
                  }
                      actual=actual.siguiente;
                  }
            }
        public void elimanodo(int dato){
    nodo actual= new nodo();
    nodo anterior = new nodo();
    
    actual =primero;
   anterior =null;
   while(actual != null){
        if (actual == primero){
            primero=primero.siguiente;
   }else{
            anterior.siguiente = actual.siguiente;
        }
        anterior =actual;
        actual = actual.siguiente;
        }
        }
          public void verlista(){
              nodo actual = new nodo();
              actual = primero;
                  while(actual != null){
                      System.out.println(" "+ actual.dato);
                      actual=actual.siguiente;
                  }
                  
              }
          
}

                
   
