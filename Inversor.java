import java.util.ArrayList;
import java.util.List;

public class Inversor {
    private String nombre;
    public List<Accion> accionesSuscritas;

    public Inversor(String nombre) {
        this.nombre = nombre;
        this.accionesSuscritas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void suscribirseA(Accion accion) {
        accionesSuscritas.add(accion);
    }

    public void notificarCambioPrecio(Accion accion, double nuevoPrecio) {
        System.out.println("Notificando a " + nombre + " que el precio de " + accion.getNombre() + " ha cambiado a " + nuevoPrecio);
    }
}