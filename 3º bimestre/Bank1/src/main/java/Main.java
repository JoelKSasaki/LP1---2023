import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void gerenciarPedidos(){
        Pessoa p1 = new Pessoa("Joel", "Sasaki", "joel@email", new Endereco("rua rústica", "Rony", "São Paulo"));
        Produto produto = new Produto("calça", 45.50);
        Produto produto2 = new Produto("gaita", 165.99);
        Pedido pedido = new Pedido(p1, Arrays.asList(produto, produto2));



        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(p1);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));


        Endereco endeereco1 = new Endereco("rua rústica", "Rony", "São Paulo");

        transaction.begin();

        session.persist(endeereco1);

        transaction.commit();

        List<Endereco> enderecos = session.createQuery("from Endereco", Endereco.class).list();

        enderecos.forEach(E -> System.out.println(E));

    }
    public static void main(String[] args) {
        gerenciarPedidos();
    }


}
