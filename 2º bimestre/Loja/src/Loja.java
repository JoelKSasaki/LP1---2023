import java.util.ArrayList;
public class Loja {

        private String nome;
        private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        private ArrayList<Pedidos> pedido = new ArrayList<Pedidos>();

        public Loja (String nome){
                this.nome = nome;
        }

        public String getNome() {
                System.out.println(nome);
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

}
