/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import static co.edu.ucundinamarca.tallern.Main.log;
import java.util.Scanner;

/**
 *
 * @author ZARAT
 */
public class ListaSimple {

    nodo primero;
    nodo ultimo;
    nodo inicio;
    Scanner teclado = new Scanner(System.in);

    public ListaSimple() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int s) {
        nodo nuevo;
        nuevo = new nodo(s);
        nuevo.dato = s;
        if (inicio == null) {
            nuevo.siguiente = null;
            inicio = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }

    }

    public void verlista() {
        nodo Recorrer = inicio;
        while (Recorrer != null) {
            if (Recorrer.siguiente == null) {
                log.info("el ultimo dato es: " + Recorrer.dato);
            }
            Recorrer = Recorrer.siguiente;
        }

    }

    public void ordena(int info) {
        int aux;
        nodo recorrer = inicio;
        int array[] = new int[info];
        for (int i = 0; i < info; i++) {
            array[i] = recorrer.dato;
            recorrer = recorrer.siguiente;
        }
        for (int k = 0; k < info; k++) {
            for (int j = k + 1; j < info; j++) {
                if (array[k] < array[j]) {
                    aux = array[k];
                    array[k] = array[j];
                    array[j] = aux;
                }
            }
        }
        ListaSimple nueva = new ListaSimple();
        for (int f = 0; f < info; f++) {
            nueva.ingresar(array[f]);
        }
        nueva.verlista();
    }
    public void repeticion(int inf)
 {
  int frecTemp, frecModa=0, moda=-1;
  nodo recorrer=inicio;
  int array[]=new int [inf];
  for(int i=0;i<inf;i++)
  {
  array[i]=recorrer.dato;
  recorrer=recorrer.siguiente;
  }
  for(int i=0;i<array.length-1;i++)
  {
   frecTemp=1;
   for(int j=i+1;j<array.length;j++)
   {
    if(array[i]==array[j])
     frecTemp++;
   }
   if(frecTemp>frecModa)
   {
    frecModa=frecTemp;
    moda=array[i];
   }
  }
  System.out.println("El elemento más repetido en la lista es: "+moda+", con una frecuencia de: "+frecModa);
 }
}


