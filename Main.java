public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        Accion accionApple = new Accion("AAPL", 100.0);
        Accion accionMicrosoft = new Accion("GOOG", 2000.0);
        Accion accionAmazon = new Accion("MSFT", 50.0);

        mercado.agregarAccion(accionApple);
        mercado.agregarAccion(accionMicrosoft);
        mercado.agregarAccion(accionAmazon);

        Inversor inversor1 = new Inversor("Juan");
        Inversor inversor2 = new Inversor("María");
        Inversor inversor3 = new Inversor("Pedro");

        // Agregamos los inversores al mercado
        mercado.agregarInversor(inversor1);
        mercado.agregarInversor(inversor2);
        mercado.agregarInversor(inversor3);

        // Suscribimos a el inversor1 (Juan) a las acciones 1 y 2 (AAPL y GOOG)
        inversor1.suscribirseA(accionApple);
        inversor1.suscribirseA(accionMicrosoft);

        // Suscribimos a el inversor2 (María) a las acciones 2 y 3 (GOOG y MSFT)
        inversor2.suscribirseA(accionMicrosoft);
        inversor2.suscribirseA(accionAmazon);

        // Suscribimos a el inversor3 (Pedro) a las acciones 1 y 3 (AAPL y MSFT)
        inversor3.suscribirseA(accionApple);
        inversor3.suscribirseA(accionAmazon);

        // Cambiamos el precio de las acciones
        accionApple.setPrecio(120.0);
        mercado.notificarCambioPrecio(accionApple, 120.0);

        accionMicrosoft.setPrecio(2100.0);
        mercado.notificarCambioPrecio(accionMicrosoft, 2100.0);
    }
}