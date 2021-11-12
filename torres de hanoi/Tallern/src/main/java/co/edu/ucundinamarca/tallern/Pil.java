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
public class Pil {
    int elemento;
    Pil siguiente;
    Pil(int x){
        elemento = x;
        siguiente = null;
    }

    Pil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Pila{
    private Pil cima;
    public Pila()
    {
        cima = null;
    }
    public boolean  pilaVacia(){
        if(cima==null)
        {
            return true;
        }else
        {
            return false;
        }
        
    }
    public void insertar(int elemento)
    {
        Pil nuevo;
        nuevo = new Pil(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;        
    }
    public int quitar()
    {
        if(pilaVacia())
        {
            return -1;
        }
            int aux = cima.elemento;
      
        cima = cima.siguiente;
        return aux;
    }
    public void limpiarPila(){
        Pil t;
        while (pilaVacia()){
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}