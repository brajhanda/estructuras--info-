/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author ZARAT
 */
public class prin {
    static Logger a = Logger.getLogger(prin.class.getName());
    static Scanner Teclado = new Scanner(System.in);
    static LISTA cola = new LISTA();
    static LISTA colaA = new LISTA();
    static int longitud = 2;
   
    
    public static void imprime(){
       System.out.println("muestra");
        int turno  = 1;
        for(int a = 0; a < longitud; a++){
            System.out.println(cola.MostrarDato()+"con num de identi"+colaA.MostrarDato ()+" turno: " + turno);
            turno++;
        }
                
                
    }
    public static void uno(){
        cola.insertar("pepe");
        colaA.insertar("123");
        cola.insertar("MARI");
        colaA.insertar("322");
        imprime();
    }
      public static void main  (String[] args) {
          uno();
}
}