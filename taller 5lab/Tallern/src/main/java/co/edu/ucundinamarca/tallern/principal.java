/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author ZARAT
 */
public class principal {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
  ListaCircular lista= new ListaCircular();
          int opcion = 0;
          do{
              System.out.print("lista simple");
          System.out.print("1dar nodo");
               System.out.print("2 busca nodo");
                System.out.print("3 modificar nodo");
                 System.out.print("4eliminar nodo");
                  System.out.print("5 despejar lista");
                   System.out.print("salir");
                  opcion = teclado.nextInt();
                  switch (opcion){
                   case 1:
                   System.out.println("\n dar nodo");
                   System.out.println("\n igresar valor del nodo buscar");
                   int dato = teclado.nextInt();
                   lista.data(dato);
                   break;
                   case 2:
                   System.out.println("\n dar nodo");
                   System.out.println("\n igresar valor deñ nodo buscar");
                   int datos = teclado.nextInt();
                   lista.buscarnodo(datos);
                   break;
                   case 3:
                   break;
                   case 4:
                   break;
                   case 5:
                   System.out.println("\n listado de nodosr");
                   int datoss = teclado.nextInt();
                   
                   break;
                   
                   default:
          }
          }while(opcion !=6);
}

                   
}

              
          
