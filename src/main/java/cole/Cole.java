/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.apache.log4j.Logger;
/**
 *
 * @author ZARAT
 */
public class Cole {

    private int num;
    private int lugar;

    Scanner examina = new Scanner(System.in);

    static Logger log = Logger.getLogger(Cole.class.getName());
    Scanner analiza = new Scanner(System.in);

    Map estu = new HashMap();

    public void addEstudiante() {
        char entrada;
        do {

            log.info("dijite la nacionalidad");
            String nacionalidad = examina.next();
            estu.put(num, nacionalidad.toUpperCase());
            num++;

            log.info("para introducir la nacionalidad dijite Y ,pero si no quiere intraducir precione N");
            entrada = examina.next().charAt(0);

        } while (entrada != 'n' && entrada != 'N');
    }

    public void MostrarEstudiantes() {
        log.info("Alumnos registradas:" + estu.values());
    }

    public void numeroestudian() {
        log.info("cantidad de estudiantes: " + estu.size());
    }

    public void borra() {
        char resp = 0;
        log.info("si quiere borrar aprete y , si no qujiere borrar aprete N");
        resp = examina.next().charAt(0);
        if (resp == 'Y') {
            estu.clear();
            log.info("borrado");
        } else {
            log.info("no se borro");
        }
    }

}
