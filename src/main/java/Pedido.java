public class Pedido {
    private Estado estado;

    public Pedido(){
        this.estado = new EnTramite(this);
    }

    public void setEstado(Estado e){
        this.estado = e;
    }

    public void ModificarPedido(){
        estado.Modificar();
    }

    public void DevolverPedido(){
        estado.Devolver();
    }

    public void VerUbicaciónPedido(){
        estado.VerUbicacion();
    }

    public void PrepararPedido(){
        estado.Preparar();
    }

    public void RecogerPedido(){
        estado.Recoger();
    }

    public void EntregarPedido(){
        estado.Entregar();
    }
}
