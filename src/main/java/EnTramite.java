public class EnTramite implements Estado{
    private Pedido pedido;

    public EnTramite(Pedido p){
        this.pedido = p;
    }
    public void Modificar() {
        System.out.println("Su pedido se ha modificado correctamente.");
    }

    public void Preparar() {
        System.out.println("El pedido ha sido preparado.");
        pedido.setEstado(new Preparado(pedido));
    }

    public void Recoger() {
        System.out.println("El pedido aun no esta listo para recoger.");
    }

    public void Entregar() {
        System.out.println("El pedido aun no esta listo para entregar.");
    }

    public void Devolver() {
        System.out.println("No se puede devolver un pedido que no ha sido entregado.");
    }

    public void VerUbicacion() {
        System.out.println("El pedido se está preparando en la tienda.");
    }
}
