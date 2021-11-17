
package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class arbolito {

    arbolbinario arbolbinario = new arbolbinario();
    private String elementosingresados = "";

    static Logger log = Logger.getLogger(arbolito.class.getName());

    public static void main(String[] args) {
        arbolito arbol = new arbolito();
        if (arbol.iniciar()) {
            arbol.creararbol();
        }
    

    
else {
    System.exit(0);
    }
    }
    public String procesoExepcion(String mas) {
        return (mas.equals("null")) ? "error intento cerrar":"";
    }

    public boolean iniciar() {
        return JOptionPane.showConfirmDialog(null, "ejecucion arbol"
                + "desea continuar", "arbol", JOptionPane.YES_NO_OPTION, 3) == 0;

    }

    public void creararbol() {
        Object elemento;
        int numnodo;
        try {
            int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "cantidad nodos"
                    + "que tendra el arbol ", 3));
            for (int i = 0; i < tamaño; i++) {
                numnodo = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nom nod","AGREGAR NODO",3));            
            elemento = JOptionPane.showInputDialog(null, "ingrese nodo:","AGREGAR NODO", 3);
            arbolbinario.agregar(numnodo,  elemento);
            elementosingresados += "nodo no " + numnodo + ",valor" + elemento+"\n";
            }
        

        ejecucion();

    }
    catch (NumberFormatException e){
            
 
  JOptionPane.showInputDialog(null, procesoExepcion(e.getMessage()), "error");
        elementosingresados = "";
        arbolbinario.vaciaarbol();
        creararbol();

    }
}
    
    public void ejecucion() {
        while (true) {
            try {
                String menu = "digite su opcion"
                        + "1imprimir datos ingresados "
                        + "2. imprimir por niveles "
                        + "3 imprime preorden "
                        + "4im primir inorden"
                        + "5 imprime postorden "
                        + "6 salir  ";
                int opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "arboles", 3));
                switch (opc) {
                    case 1:
                        System.out.println("los datos son " + elementosingresados);
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "el resutado esta en consola","aclaracion", 2);
                        break;
                    case 2:
                        System.out.println("por niveles");
                        arbolbinario.retornaraltura();
                        arbolbinario.porniveles();
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "el resultado se imprio","aclaracion", 2);
                        break;
                    case 3:
                        System.out.println("pre orden");
                        arbolbinario.preordern(arbolbinario.raiz);
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "el resultado se imprio","aclaracion", 2);
                        break;
                    case 4:
                        System.out.println("in orden");
                        arbolbinario.inorden(arbolbinario.raiz);
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "el resultado se imprio","aclaracion", 2);
                        break;
                    case 5:
                        System.out.println("post orden");
                        arbolbinario.postorden(arbolbinario.raiz);
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "el resultado se imprio","aclaracion", 2);
                        break;
                    case 6:
                        System.exit(0);
                        JOptionPane.showMessageDialog(null, "adios"+
                        JOptionPane.INFORMATION_MESSAGE
                        );
            break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, procesoExepcion(e.getMessage()), "error", 0);

            }

        }
    }
}