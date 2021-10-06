/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import static java.lang.Math.log;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author ZARAT
 */
public class NewClass {
    static Logger log = Logger.getLogger(NewClass.class.getName());
    
    public static void main(String[] args) {
        
    
  
Scanner Teclado = new Scanner(System.in);
log.info("Por favor digite el numero del cual desea conocer el factorial ");
int num = Teclado.nextInt();
int fact = factor.fact(num);
log.info("El factorial de: " + num + " es :" + fact);




}

    private static int facto(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
