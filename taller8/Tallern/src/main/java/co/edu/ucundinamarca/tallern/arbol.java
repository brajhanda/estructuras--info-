
import org.apache.log4j.Logger;

import co.edu.ucundinamarca.tallern.Main;
import org.apache.log4j.Logger;

public class arbol {

    static Logger log = Logger.getLogger(Main.class.getName());
    Nodo raiz;

    public arbol() {
        raiz = null;
    }

    public void insertar(int i, Object fruta) {
        Nodo n = new Nodo(i);
        n.contenido = fruta;
        if (raiz == null) {
            raiz = n;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                n.padre = aux;
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda;
                }
            
