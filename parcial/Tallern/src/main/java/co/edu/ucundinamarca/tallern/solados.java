/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Random;
import org.apache.log4j.Logger;


/**
 *
 * @author ZARAT
 */
public class solados
{
    static Logger log = Logger.getLogger(Main.class.getName());
        public static void main(String[] args) {
            Random sobreviviente = new Random();
            int N = sobreviviente.nextInt(5);
            System.out.print("el soldado sobreviviente es el numero"+ N );
        }
}
