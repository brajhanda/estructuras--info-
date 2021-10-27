/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ZARAT
 */ 
public class listacir {
    Scanner teclado =new Scanner(System.in);
     nodos primero;
    nodos ultimo;

    public listacir(){
        primero=null;
        ultimo=null;
    
    }
    public boolean vacio(){
        return ultimo==null;
    }
    public listacir insertar(int elemeto){
        nodos nuevo=new nodos (elemeto);
      if(ultimo!=null){
          nuevo.siguiente=ultimo.siguiente;
          ultimo.siguiente=nuevo;
          
      }
      ultimo=nuevo;
      return this;
    }
    
      public void modificarnodo(int elemeto){
            nodos actual = new nodos(elemeto);
         actual = primero;
         do{
               if (actual.dato==elemeto){
                   System.out.print("ingrese para modificar el dato");
                   actual.dato = teclado.nextInt();
               }
             actual = actual.siguiente;
         }while (actual!=primero);
         }
      
    public void mostrarLista(){
        nodos auxiliar=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena + "["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
        }while (auxiliar!=ultimo.siguiente);
      System.out.println("sus datos"+ cadena );
    }
  public void buscarrrnodo(int elemeto ){
            nodos actual = new nodos (elemeto);
         actual = primero;
         boolean encontrar = false;
         do{
               if (actual.dato==elemeto){
                  encontrar = true;
               }  
        
         }while (actual!=primero);
         
          actual = actual.siguiente;
          
         if(encontrar == true){
             System.out.println(" encontrado");
         }else{
             System.out.println(" no encontrado");
             }
         }
        public boolean eliminardodo(int elemeto){
            nodos actual;
            boolean encontrado=false;
        actual = ultimo;
         while(actual.siguiente!=ultimo && !encontrado){
         encontrado=(actual.siguiente.dato==elemeto);
         if(!encontrado){
             actual=actual.siguiente;
         }
         }
         encontrado=(actual.siguiente.dato==elemeto);
         if(encontrado){
             nodos auxiliar=actual.siguiente;
        if(ultimo==ultimo.siguiente){
            ultimo=null;
        }else{
            if(auxiliar==ultimo){
                ultimo=actual;
            }
            actual.siguiente=auxiliar.siguiente;
        }
        auxiliar=null;
        }
         return encontrado==true;
        }

}
