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
import java.io.*;

public class apartado {

  public static void main(String args[]) {
punto2 prueba = new punto2();
prueba.push("A");
prueba.push("B");
prueba.push("C");
prueba.push("D");

System.out.println("Imprimiendo Pila");
for (int a = 0; a < 4; a++) {
System.out.println("" + prueba.pop());
}
    
  }

}
