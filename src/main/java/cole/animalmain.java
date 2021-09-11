/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

import org.apache.log4j.Logger;



/**
 *
 * @author ZARAT
 */
public class animalmain {
    static Logger log = Logger.getLogger(animalmain.class.getName());

    public static void main(String[] args) {
        anima gato = new anima("soct", 7, " Canina", 32);
        anima mamut = new anima("mamut", 4, "abeja", 43);

        if (gato.equals(mamut)) {
            log.info(" mismo animal ");
        } else {
            log.info(" distintos animales ");
        }
    }

}


