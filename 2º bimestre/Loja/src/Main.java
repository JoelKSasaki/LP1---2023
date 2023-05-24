public class Main {
    public static void main(String[] args){
        Loja loja = new Loja("Japamarket");

        System.out.println("Bem vindo ao " + loja.getNome());

        loja.addCliente(new Cliente("Rafael", "43235986385", "94860-5894"));
        loja.addPedidos((new Pedidos("Feijão e Arroz", 22.50, "2045-6114", "Rafael")));

    }
}
