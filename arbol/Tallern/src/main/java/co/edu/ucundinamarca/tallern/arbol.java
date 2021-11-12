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
public class arbol {
   Nodo raiz;
   public arbol(){
   
   }    
    public void insertar (int i, Object fruta){
        Nodo n = new Nodo(i);
        n.contenido = fruta;
        if (raiz==null){
            raiz = n;
        }else{
            Nodo aux = raiz;
            while(aux!=null){
                n.padre = aux;
                if(n.llave >= aux.llave){
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                
                }
            }
            public void recorrer (Nodo n){
                if (n!=null){
                    recorrer(n.izquierda);
                    System.out.println("indice" +n.llave+" fruta "+n.contenido);
                    recorrer(n.derecha);
                }
            }

            }
        }
    }
public class Nodo{
    public Nodo padre;
    public Nodo derecha;
    public Nodo izquierda;
    public Nodo llave;
    public Object contenido;
    
    public Nodo(int indice){
       llave=indice;
       derecha=null;
       izquierda=null;   
        padre=null;    
       contenido=null;       
    }
}
    

