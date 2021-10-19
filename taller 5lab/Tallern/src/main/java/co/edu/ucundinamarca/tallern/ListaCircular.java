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
public class ListaCircular {
    nodo primero;
    nodo ultimo;
    public ListaCircular(){
        primero = null;
        ultimo = null;
          
    }
    public  ListaCircular data(int x){
        
        nodo nuevo=new nodo (x);
      if(ultimo!=null){
          nuevo.siguiente=ultimo.siguiente;
          ultimo.siguiente=nuevo;
          
      }
      ultimo=nuevo;
      return this;
    }
    
    
        public void buscarnodo(int x){
         nodo actual = new nodo(x);
         actual = primero;
         boolean encontrar = false;
         do{
             if (actual.dato==x){
                 encontrar = true;
             }
             
             actual = actual.siguiente;
         }while(actual != primero);
         if(encontrar == true){
             System.out.println("Nodo encntrado");
         }else{
               System.out.println("Nodo no encntrado");
             }
         }
        public void desplegarLista(){
        }
    
}
