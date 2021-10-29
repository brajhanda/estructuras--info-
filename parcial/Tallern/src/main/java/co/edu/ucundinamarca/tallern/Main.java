
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
static ListaSimple a=new ListaSimple();
    public static void main(String[] args) {
       a.ingresar(1);
       a.ingresar(2);
       a.ingresar(4);
       a.ingresar(3);
       a.ordena(4);
       a.repeticion(0);
    }

}
