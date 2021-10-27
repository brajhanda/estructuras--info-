
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class principal {
    public static void pila()
    {
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
    }
public static void cola()
    {
        Colalista cola = new Colalista();
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
    }

    static Logger log = Logger.getLogger(principal.class.getName());

    public static void main(String[] args) {
        {
           pila();
           cola();
        }
        public static void print(String numero){
            System.out.print(numero);
            
        }

}
}




