public class Entregado implements Estado{
    private Pedido pedido;

    public Entregado(Pedido p){
        this.pedido = p;
    }
    public void Modificar() {
        System.out.println("El pedido ya ha sido entregado, no se puede modificar.");
    }

    public void Devolver() {
        System.out.println("El pedido ha sido devuelto correctamente.");
        pedido.setEstado(new Devuelto(pedido));
    }

    public void VerUbicacion() {
        System.out.println("El pedido ha sido entregado correctamente.");
    }

    public void Preparar() {
        System.out.println("No se puede preparar un pedido entregado.");
    }

    public void Recoger() {
        System.out.println("No se puede recoger un pedido entregado.");
    }

    public void Entregar() {
        System.out.println("El pedido ya ha sido entregado");
    }
}
