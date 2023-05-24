import java.util.ArrayList;
import java.util.List;
public class Loja {

    private String nome;
    private List<Cliente> cliente = new ArrayList<>();
    private List<Pedidos> pedido = new ArrayList<>();

    public Loja (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getCliente(){
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente){
        this.cliente = cliente;
    }

    public void addCliente(Cliente clientes){
        cliente.add(clientes);
    }

    public List<Pedidos> getPedidos(){
        return pedido;
    }

    public void setPedidos(List<Pedidos> pedido){
        this.pedido= pedido;
    }

    public void addPedidos(Pedidos pedidos){
        pedido.add(pedidos);
    }

}