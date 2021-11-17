/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

public class arbolbinario {

    public static nodo raiz;
    public String[] niveles;
    public int tamaño;
    int altura;

    public arbolbinario() {
        this.raiz = null;

    }

    public nodo getraiz() {
        return raiz;
    }

    public void setraiz(nodo raiz) {
        this.raiz = raiz;
    }

    /**
     *
     * @param key
     * @param value
     */
    public void agregar(int key, Object value) {
        nodo n = new nodo(key, value);
        if (raiz == null) {
            raiz = n;

        } else {
            nodo temp = raiz;
            while (temp != null) {
                n.setpadre(temp);
                if (n.getllave() < temp.getllave()) {
                    temp = temp.gethijoizquierdo();
                } else {
                    temp = temp.gethijoderecho();
                }
            }
        
        if (n.getllave() < n.getpadre().getllave()) {
            n.getpadre().sethijoizquierdo(n);
        } else {
            n.getpadre().sethijoderecho(n);

        }
    }
    }
    public boolean isEmpty() {
        return raiz == null;
    }

    public void vaciaarbol() {
        raiz = null;
    }

    public int retornaraltura() {
        altura = 0;
        retornaraltura(raiz, 0);
        return altura;
    }

    private void retornaraltura(nodo no, int nivel) {
        if (no != null) {
            retornaraltura(no.gethijoizquierdo(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornaraltura(no.gethijoderecho(), nivel + 1);
        }
    }

    public void porniveles() {
        niveles = new String[altura + 1];
        imprimirnivel(raiz, 0);
        for (int i = 0; 1 < niveles.length; i++) {
            System.out.println("llaves" + niveles[1] + "nivel1" + (1 + 1) + ')');
        }
    }

    private void imprimirnivel(nodo no, int nivel) {
        if (no != null) {
            niveles[nivel] = no.getllave() + "" + ((niveles[nivel] != null) ? niveles[nivel] : "");
            imprimirnivel(no.gethijoderecho(), nivel + 1);
            imprimirnivel(no.gethijoizquierdo(), nivel + 1);
        }
    }

    public void preordern(nodo no) {
        if (no != null) {
       System.out.println("la llave es: "+ no.getllave() + " y el elemento es: " + no.getvalue() );
preordern(no.gethijoizquierdo());
            preordern(no.gethijoderecho());
        }
    }

    public void inorden(nodo no) {
        if (no != null) {
            inorden(no.gethijoizquierdo());
            System.out.println("la llave es: "+ no.getllave() + " y el elemento es: " + no.getvalue() );
inorden(no.gethijoderecho());
        
    
        }
        }
public void postorden(nodo no) {
        if (no != null) {
            postorden(no.gethijoizquierdo());
            postorden(no.gethijoderecho());
            System.out.println("la llave es: "+ no.getllave() + " y el elemento es: " + no.getvalue() );
}
}
}
