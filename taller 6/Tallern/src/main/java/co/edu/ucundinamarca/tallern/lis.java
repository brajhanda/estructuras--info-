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
        public void modificar(){
        nod actual=new nod();
      actual=primero;
      do{
          System.out.println(actual.datos);
          actual=actual.siguiente;
           System.out.println(actual.datos);
           actual=actual;
      }while(actual!=primero);
      public void buscar(int x){
nod actual=new nod();
actual=ultimo;
boolean encontrado=false;

do{
if(actual.datos==x){
encontrado=true;
datos=actual.datos;
}
actual=actual.anterior;
}while(actual!=ultimo);
if(encontrado==true){
System.out.println("nodo encontrado");
System.out.println(datos);
}else{
System.out.println("nodo no encontrado");
}
}
public void modificar(int x){
nod actual=new nod();
actual=primero;
do{
if(actual.datos==x){
System.out.println("ingrese un nuevo valor");
actual.datos=teclado.nextInt();
}
    actual=actual.siguiente;
}while(actual!=primero);
}
}    
          
}
}



    
