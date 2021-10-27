package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        lis lis = new lis();
        int opcion = 0;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1 ingre nodo");;
            System.out.println("busca en la lista");
            System.out.println("modifica");
            System.out.println("sal");
            switch (opcion) {
                case 1:
                    System.out.println("ingresar nodo");
                    int dato = teclado.nextInt();
                    lis.ingresar(dato);
                    break;
                
                case 2:
                    System.out.println("busca");
                    System.out.println("ingrese el dato a buscar");
                    int dato3 = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("ingresa dato a kmodificar");
                    int dato4 = teclado.nextInt();
                    lis.modificar(dato4);
            }
        } while (opcion != 5);
    }
}
