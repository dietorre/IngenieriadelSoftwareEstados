public class Preparado implements Estado{
    private Pedido pedido;

    public Preparado(Pedido p){
        this.pedido = p;
    }
    public void Modificar() {
        System.out.println("Su pedido se ha modificado correctamente.");
        pedido.setEstado(new EnTramite(pedido));
    }

    public void Devolver() {
        System.out.println("No se puede devolver un pedido que no ha sido entregado.");
    }

    public void VerUbicacion() {
        System.out.println("El pedido  está preparado en la tienda.");
    }

    public void Preparar() {
        System.out.println("El pedido ya está preparado");
    }

    public void Recoger() {
        System.out.println("El pedido se ha recogido correctamente.");
        pedido.setEstado(new EnEntrega(pedido));
    }

    public void Entregar() {
        System.out.println("No se puede entregar un pedido preparado.");
    }
}
