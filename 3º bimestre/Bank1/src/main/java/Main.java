import entity.Endereco;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joel", "Sasaki", "joel@email", new Endereco("rua rústica", "Rony", "São Paulo"));
        Pessoa p2 = new Pessoa("Rafa", "Muñoz", "rafa@email", new Endereco("rua lima", "Limões", "Rio de Janeiro"));
        Pessoa p3 = new Pessoa("Sarah", "Sabongi", "sarah@email", new Endereco("rua rocha", "Pedreiros", "Limeira"));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));



        Endereco endeereco1 = new Endereco("rua rústica", "Rony", "São Paulo");
        Endereco endeereco2 = new Endereco("rua lima", "Limões", "Rio de Janeiro");
        Endereco endeereco3 = new Endereco("rua rocha", "Pedreiros", "Limeira");

        transaction.begin();

        session.persist(endeereco1);
        session.persist(endeereco2);
        session.persist(endeereco3);

        transaction.commit();

        List<Endereco> enderecos = session.createQuery("from Endereco", Endereco.class).list();

        enderecos.forEach(E -> System.out.println(E));


    }
}
