import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Accion> acciones;
    private List<Inversor> inversores;

    public Mercado() {
        this.acciones = new ArrayList<>();
        this.inversores = new ArrayList<>();
    }

    public void agregarAccion(Accion accion) {
        acciones.add(accion);
    }

    public void agregarInversor(Inversor inversor) {
        inversores.add(inversor);
    }

    public void notificarCambioPrecio(Accion accion, double nuevoPrecio) {
        for (Inversor inversor : inversores) {
            for (Accion accionSuscrita : inversor.accionesSuscritas) {
                if (accionSuscrita.equals(accion)) {
                    inversor.notificarCambioPrecio(accion, nuevoPrecio);
                }
            }
        }
    }
}