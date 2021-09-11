/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

import static cole.Cole.log;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ZARAT
 */
public class seman {

    private static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Scanner examina = new Scanner (System.in);
    ArrayList<String> dia =new ArrayList<String>();
    public void dias(){
        dia.add("lune");
        dia.add("martes");
        dia.add("miercoles");
        dia.add("jueves");
        dia.add("viernes");
        dia.add("sabado");
        dia.add("domingo");    
    }
    public void cantidad(){
        log.info(dia.size());
        
    }
public void dardia(){
    int n;
    log.info("dijatar numero del dia que quiere saber");
    n = examina.nextInt();
    
    log.info(dia.get(n-1));
    
    
    
}
public void decirdiass(){
    log.info(dia);
    
}

}    
    
