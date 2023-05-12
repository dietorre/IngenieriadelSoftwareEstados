public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido();

        p.VerUbicaciónPedido();
        p.ModificarPedido();
        p.DevolverPedido();
        p.EntregarPedido();
        p.RecogerPedido();
        p.PrepararPedido();

        System.out.println();

        p.VerUbicaciónPedido();
        p.DevolverPedido();
        p.EntregarPedido();
        p.PrepararPedido();
        p.ModificarPedido();

        System.out.println();

        p.PrepararPedido();
        p.RecogerPedido();

        System.out.println();

        p.VerUbicaciónPedido();
        p.ModificarPedido();
        p.DevolverPedido();
        p.RecogerPedido();
        p.PrepararPedido();
        p.EntregarPedido();

        System.out.println();

        p.VerUbicaciónPedido();
        p.ModificarPedido();
        p.RecogerPedido();
        p.PrepararPedido();
        p.EntregarPedido();
        p.DevolverPedido();

        System.out.println();

        p.VerUbicaciónPedido();
        p.ModificarPedido();
        p.RecogerPedido();
        p.PrepararPedido();
        p.EntregarPedido();
        p.DevolverPedido();
    }
}
