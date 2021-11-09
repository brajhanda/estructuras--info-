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
     String elemento;
    NodoCola siguiente;
    public NodoCola(String x)
    {
        elemento = x;
   siguiente = null;
    }
}
class LISTA
{
    protected NodoCola frente;
    protected NodoCola fin;
public LISTA()
{
    frente = fin = null;
}
public void insertar (String elemento)
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
    public String MostrarDato() {
        String aux;
        if (!colaVacia()) {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else {
            return -1 + "";
        }
        return aux;
    }

public  String quitar ()
{
     String aux;
    if(!colaVacia())
    {
        aux = frente.elemento;
        frente = frente.siguiente;
        
        
    }else
    {
        return -1+"";
    }
    return aux;
}
public void borrarCola()
{
    while(frente!=null){
    frente = frente.siguiente;

    }
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
