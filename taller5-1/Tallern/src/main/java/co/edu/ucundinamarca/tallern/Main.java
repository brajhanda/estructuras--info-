
package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
    listacir  listita = new listacir();
    int opcion = 0, elemento;
    do{
        try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar nodo incial \n "
                   + "2. Agregar nodo final \n "
                   + "3. Mostrar la lista de inicio a fin \n "
                   + "4 salir \n" 
                   + "que deceas hacer? "+"menu opciones " +
              JOptionPane.INFORMATION_MESSAGE));
               switch(opcion){
                   case 1:
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                               "Ingresa el elmento del nodo"+ "agregando nodo a la lista circulas"+
                  JOptionPane.INFORMATION_MESSAGE));
                  listita.insertar(elemento);
                  break;
                       case 2:
                           //elemento = Integer.parseInt(JOptionpane.showInputDialog(null,
                           //"ingresar el lemento del nodo","agregando nodo final ",
                           //JOptionPane.INFORMATION_MESSAGE));
                        break;
                       case 3:
                       if (!listita.vacio()){
                           listita.mostrarLista();
                       }else{
                           JOptionPane.showInputDialog(null,"aun no hay nodos ",
                           "lista final "+JOptionPane.INFORMATION_MESSAGE);
                       }
                       break;
                       case 4:
                           JOptionPane.showInputDialog(null,"aplicazion finalizada ",
                           "fin ",JOptionPane.INFORMATION_MESSAGE);
                           break;
                  
                       default:
                            JOptionPane.showInputDialog(null,"no slae en el menu ",
                           "incorrecto ",JOptionPane.INFORMATION_MESSAGE);
                           
                       
               }}
               catch (NumberFormatException n){
            JOptionPane.showInputDialog(null,"error"+n.getMessage());
                }
    }while (opcion != 4);
    

    }
    }



