
package Modelo;

public class Tiempo extends interes {
    int t;

  
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

   public int CapFinal(){
     
       for(int a=0;a<t;a++){
    CapInicial=(((CapInicial*inte)/100)+(CapInicial));
   
       }
        return  CapInicial;
    
}

   

}
