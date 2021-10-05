package cole;

import java.util.Objects;


public class anima {

    private String nombre;
    private int patas;
    private String tipo;
    private int edad;

    public anima(String nombre, int patas, String tipo, int edad) {
        this.nombre = nombre;
        this.patas = patas;
        this.tipo = tipo;
        this.edad = edad;
    }

 

    @Override
    public String toString() {
        return "Persona [nombre : " + getNombre() + " patas : " + getPatas() + " tipo : " + getTipo() + "]edad : " + getEdad();
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

        anima that = (anima) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getPatas(), that.getPatas())
                && Objects.equals(this.getTipo(), that.getTipo())
               && Objects.equals(this.getEdad(), that.getEdad());
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + getEdad();
        result = 31 * result + getPatas();
        return result;
        

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    /**
     * @return the nombre
     */
    

    

    /**
     * @return the identificacion
     */
   