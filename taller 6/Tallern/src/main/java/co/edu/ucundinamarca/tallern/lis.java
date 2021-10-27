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
public class lis {
 nod primero;
    nod ultimo;
    int datos;
    Scanner teclado=new Scanner (System.in);
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
    }
   
        public void modificar(int x){
        nod actual=new nod();
      actual=primero;
      do{
          if(actual.datos==x){
    
          System.out.println("ingrese datos a modificar");
          actual.datos=teclado.nextInt();
          }    
          actual=actual.siguiente;
      }while(actual!=primero);
      }
      }





    
