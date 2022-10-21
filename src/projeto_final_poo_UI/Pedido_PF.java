package projeto_final_poo_UI;
public class Pedido_PF {
    Cliente_PF cliente;
    Atendente_PF atendente;
    String data_hora_pedido;
    boolean delivery;

    public void setCliente(Cliente_PF cliente) {
        this.cliente = cliente;
    }

    public void setAtendente(Atendente_PF atendente) {
        this.atendente = atendente;
    }

    public void setData_hora_pedido(String data_hora_pedido) {
        this.data_hora_pedido = data_hora_pedido;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
    
     void ChamadaPedido(){
        System.out.println("\n----- Pedido: -----");
        System.out.println("Data e hora do pedido: " + this.data_hora_pedido);
        System.out.println("Delivery: " + this.delivery);
    }
    
}
