/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;

/**
 *
 * @author ZARAT
 */
public class listacir {
    nodos ultimo;
    public listacir(){
        ultimo=null;
        
    }
    public nodos vacio(){
        return ultimo=null;
    }
    public listacir insertar(int elemento){
        nodos nuevo=new nodos (elemento);
      if(ultimo!=null){
          nuevo.siguiente=ultimo.siguiente;
          ultimo.siguiente=nuevo;
          
      }
      ultimo=nuevo;
      return this;
    }
    public void mostrarLista(){
        nodos auxiliar=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena + "["+auxiliar.dato+"]->";
        }while (auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,cadena,"Mostrar la lista circular",JOptionPane.INFORMATION_MESSAGE);
    }
}
       

