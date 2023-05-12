public class Devuelto implements Estado{
    private Pedido pedido;

    public Devuelto(Pedido p){
        this.pedido = p;
    }
    public void Modificar() {
        System.out.println("No se puede modificar un pedido devuelto.");
    }

    public void Devolver() {
        System.out.println("El pedido ya ha sido devuelto.");
    }

    public void VerUbicacion() {
        System.out.println("El pedido ha sido devuelto y se encuentra de nuevo en la tienda.");
    }

    public void Preparar() {
        System.out.println("No se puede preparar un pedido devuelto.");
    }

    public void Recoger() {
        System.out.println("No se puede recoger un pedido devuelto.");
    }

    public void Entregar() {
        System.out.println("No se puede entregar un pedido devuelto.");
    }
}
