/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author ZARAT
 */
public class juego {
    private int vidasiniciales=5;
    private int vidasresetantes;
    private int vidas =vidasiniciales;
    private int puntos = 0;
    public juego(int vidasiniciales){
        this.vidasiniciales=vidasiniciales;
        
    }
    public void vervidas(){
        System.out.println("estas son tus vidas actuales:"+ vidas ) ;
    }
public void pierdevida(){
    vidas= vidas - 1;
    if(vidas<0){
        System.out.println("perdiste");
        
    }
    
}
public void reinicia(){
    vidas=vidasiniciales;
   
            
}
public void actu(){
    if (vidas==puntos){
        System.out.println("su puntaje");
        

    
   }
    if (vidas>puntos){
        System.out.println("tu puntaje actual es"+vidas);
        
    }
}

}
    /**
     * @param args the command line arguments
     */
    
