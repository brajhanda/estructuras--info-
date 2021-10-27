
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 * Clase Principal
 * @author handresortiz
 */
public class principal {

    static Logger log = Logger.getLogger(Main.class.getName());
        static ListaSimple a= new ListaSimple();
        static listacir b= new listacir();
    static Scanner teclado = new Scanner(System.in);
    static int opcion=0;
    static int opcion1=0;
    static int opcion2=0;
    public static void main(String[] args) {
   
    
    do{
     
        System.out.println("elija");
            System.out.println("1.lista simple");
            System.out.println("2.1lista circular simple");
            System.out.println("sair");
           
       opcion1=teclado.nextInt();
    
    switch(opcion1){
        case 1:
            
    
             do{
                   System.out.println("¿cuantos dulces quieres?");
            System.out.println("1.ingresa ");
            System.out.println("2.busca en la lista");
            System.out.println("3.modificar");
            System.out.println("4.eliminar todo");
            System.out.println("5.enlistar");
            System.out.println("escoja su opcion");
            opcion= teclado.nextInt(); 
            switch(opcion){
                case 1:
                System.out.println("ingresar ");
                System.out.println("ingresar ");
                    int datos11 = teclado.nextInt();
                   a.ingresarNodo(datos11);
                    break;
                    case 2:
                        System.out.println("busca el ");
                        System.out.println("ingrese la cantidad de dulces  a buscar");
                       int  datos22 = teclado.nextInt();
                        a.buscarNodo(datos22);
                        break;
                        case 3:
                             System.out.println("modifica la cantidad de dulces");
                        System.out.println("ingrese el nodo a modificar para modificar");
                        int datos33 = teclado.nextInt();
                        a.modificarNodo(datos33);
                        break;
                        case 4:
                            System.out.println("eliminar");
                        System.out.println("ingrese la cantidad de dulces a eliminar");
                        int datos44 = teclado.nextInt();
                        a.elimanodo(datos44);
                            
                        break;
                        case 5:
                          System.out.println("listado de la cantidad de dulces");
                          a.verlista();
                        break;
                        default:
            }
             }while(opcion!=6);
    break;
         case 2:
             
            
    
             do{
                   System.out.println("cuantos dulces quieres");
            System.out.println("1.ingresa ");      
            System.out.println("2.eliminar");
            System.out.println("3.enlistar");
            System.out.println("escoja su opcion");
            opcion2= teclado.nextInt(); 
            switch(opcion2){
                case 1:
                System.out.println("ingresar cantidad dulces");
                System.out.println("ingresar datos");
                    int dato = teclado.nextInt();
                   b.insertar(dato);
                    break;
                        case 2:
                            System.out.println("eliminar");
                        System.out.println("ingrese la cantidad de dulces  a eliminar");
                        int dato3 = teclado.nextInt();
                        b.eliminardodo(dato3);                           
                        break;
                        case 3:
                          System.out.println("listado nodo");
                          b.mostrarLista();
                        break;
            }
             }while(opcion!=4);
             break;
    }    
    }while(opcion1!=3);
    }
}

