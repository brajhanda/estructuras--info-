
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
       arbol  a = new arbol();
       a.insertar(4, "naranja");
       a.insertar(4, "uva");
       a.insertar(4, "manzana");
       a.insertar(4, "sandia");
       a.insertar(4, "pera");
       
       arbol.recorrer(arbol.raiz);
    }

}
