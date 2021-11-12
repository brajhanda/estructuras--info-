
import org.apache.log4j.Logger;

import co.edu.ucundinamarca.tallern.Main;
import org.apache.log4j.Logger;

public class arbol {

    static Logger log = Logger.getLogger(Main.class.getName());
    Nodo raiz;

    public arbol() {
        raiz = null;
    }

    public void insertar(int i, Object manazana) {
        Nodo a = new Nodo(i);
        a.contenido = manazana;
        if (raiz == null) {
            raiz = a;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                a.padre = aux;
                if (a.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda;
                }
            
