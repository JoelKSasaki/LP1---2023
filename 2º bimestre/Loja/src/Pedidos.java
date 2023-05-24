
public class Pedidos {
    private String prod;
    private double valor;
    private String codigo;
    private Cliente cliente;

    public Pedidos(String prod, double valor, String codigo, String name){
        this.prod = prod;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String name(){
        return cliente.getNome();
    }


}