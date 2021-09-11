package cole;

import java.util.Objects;


public class Persona {

    private String nom;
    private int años;
    private int tarjeta;

    public Persona(String nom, int años, int tarjeta) {
        this.nom = nom;
        this.años = años;
        this.tarjeta = tarjeta;
    }

 
    

    @Override
    public String toString() {
        return "Persona [nom : " + getnom() + " años : " + getaños() + " tarjeta : " + gettarjeta() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Persona that = (Persona) obj;
        return Objects.equals(this.getnom(), that.getnom())
                && Objects.equals(this.getaños(), that.getaños())
                && Objects.equals(this.tarjeta(), that.gettarjeta());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getaños();
        result = 31 * result + gettarjeta();
return result;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nom;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setnom(String nombre) {
        this.nom = nombre;
    }

    /**
     * @return the edad
     */
    public int getaños() {
        return años;
    }

    /**
     * @param edad the edad to set
     */
    public void setaños(int años) {
        this.años = años;
    }

    /**
     * @return the identificacion
     */
    public int gettarjeta() {
        return tarjeta;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.tarjeta = identificacion;
    }

    private String getnom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object tarjeta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getpatas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getnombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
