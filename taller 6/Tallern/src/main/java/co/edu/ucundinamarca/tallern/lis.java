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
public class lis {
 nod primero;
    nod ultimo;
    public lis(){
        primero = null;
        ultimo = null;
          
    }
    public void ingresar (int x){
        nod nuevo =new nod();
        nuevo.datos=x;
        if(primero==null){
            primero=nuevo=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
            
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
            
            
            
            
        }
        public void mostrar(){
        nod actual=new nod();
      actual=primero;
      do{
          System.out.println(actual.datos);
          actual=actual.siguiente;
           System.out.println(actual.datos);
           actual=actual;
      }while(actual!=primero);
           
          
      }
        
        
        
    }
    
