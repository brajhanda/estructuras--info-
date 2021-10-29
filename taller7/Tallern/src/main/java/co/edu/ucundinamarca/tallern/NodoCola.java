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
public class NodoCola {
    int elemento;
    NodoCola siguiente;
    public NodoCola(int x)
    {
        
    }
}
class Colalista
{
    protected NodoCola frente;
    protected NodoCola fin;
public Colalista()
{
    frente = fin = null;
}
public void insertar (int elemento)
{
    NodoCola a;
    a = new NodoCola(elemento);
    if (colaVacia()){
        frente = a;
    }else{
        fin.siguiente = a;
    }
    fin = a;
}
public int quitar ()
{
    int aux;
    if(!colaVacia())
    {
        aux = frente.elemento;
        frente = frente.siguiente;
        
        
    }else
    {
        return -1;
    }
    return aux;
}
public void borrarCola()
{
    frente = frente.siguiente;


}
public boolean colaVacia()
{
if(frente==null)
{
return true;

}else
{
return false;
}
}
}