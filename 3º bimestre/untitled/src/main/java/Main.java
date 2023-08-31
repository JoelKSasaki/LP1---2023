import entity.Aluno;
import entity.Nota;
import entity.Prof;
import entity.Turma;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(7.6, "Pedro", "SP3058596", "82jgkk93");
        Aluno a2 = new Aluno(9.8, "Camila", "SP3096947", "9e8gj374");
        Aluno a3 = new Aluno(4.6, "Lucas", "SP3002759", "f3jt846s");
        Prof p1 = new Prof("Fábio", "SP3022857", "60437856826", "jfu9436d");
        Prof p2 = new Prof("Fabiana", "SP3020023", "40838977174", "0jgeu776g");
        Nota n1 = new Nota(7.6);
        Nota n2 = new Nota(6.3);
        Nota n3 = new Nota(9.0);
        Turma t1 = new Turma("313", 14);
        Turma t2 = new Turma("213", 07);
        Turma t3 = new Turma("113", 10);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(n1);
        session.persist(n2);

        transaction.commit();

        List<Nota> notas = session.createQuery("from Nota", Nota.class).list();
        for(int i = 0; i <notas.size(); i++){
            System.out.println(notas.get(i));
        }


    }
}
