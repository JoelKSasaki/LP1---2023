import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joel", "Sasaki", "joel@email");
        Pessoa p2 = new Pessoa("Rafa", "Muñoz", "rafa@email");
        Pessoa p3 = new Pessoa("Sarah", "Sabongi", "sarah@email");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));

    }
}
