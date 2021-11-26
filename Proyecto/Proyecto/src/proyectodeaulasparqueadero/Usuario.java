package proyectodeaulasparqueadero;

/**
 *
 * @author jandy
 */
public class Usuario {

    String Nombre;
    String Placa;
    String HoraEntrada;
    String HoraSalida;

    public Usuario(String Nombre, String Placa, String HoraEntrada, String HoraSalida) {
        this.Nombre = Nombre;
        this.Placa = Placa;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

}
