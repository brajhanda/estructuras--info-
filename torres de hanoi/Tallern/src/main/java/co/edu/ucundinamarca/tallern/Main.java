
package co.edu.ucundinamarca.tallern;
 

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

     public static void main (String [] pps) {
	if (pps.length != 0) 
	    new Hanoi((new Integer(pps[0])).intValue());
	else 
	    new Hanoi(); 
    }
}
