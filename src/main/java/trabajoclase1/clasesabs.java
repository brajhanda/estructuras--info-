/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoclase1;

import co.edu.ucundinamarca.tallern.*;

/**
 *
 * @author ZARAT
 */
public class  clasesabs{
public static void  main (String[] args){
   calcu Triangulo = new Triangulo (8, 4);
    System.out.println(Triangulo.calculararea());
    
}
}
abstract class calcu {
    private String nombre;
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre =nombre; 
    }
    public abstract double  calculararea();
    
}
class Triangulo extends calcu {
private double altura;
private double base;

public Triangulo (double altura, double base){
    this.altura = altura;
    this.base = base;
}

    @Override
    public double calculararea() {
   return altura * base / 2;
   
    }
           
    
    
}

    
    
    

    

