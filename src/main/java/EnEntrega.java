public class EnEntrega implements Estado{
    private Pedido pedido;

    public EnEntrega(Pedido p){
        this.pedido = p;
    }
    public void Modificar() {
        System.out.println("El pedido está siendo entregado, no se puede modificar.");
    }

    public void Devolver() {
        System.out.println("No se puede devolver un pedido que no ha sido entregado.");
    }

    public void VerUbicacion() {
        System.out.println("El pedido se encuentra en entrega.");
    }

    public void Preparar() {
        System.out.println("No se puede preparar un pedido en entrega.");
    }

    public void Recoger() {
        System.out.println("No se puede recoger un pedido en entrega.");
    }

    public void Entregar() {
        System.out.println("El pedido ha sido entregado correctamente.");
        pedido.setEstado(new Entregado(pedido));
    }
}
