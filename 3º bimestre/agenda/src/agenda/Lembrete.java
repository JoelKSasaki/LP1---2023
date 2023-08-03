package agenda;
import java.util.ArrayList;
import java.util.List;

public class Lembrete{

    private String nome;
    private String date;
    private String hora;
    private List<Lembrete> lembrete = new ArrayList<>();

    public Lembrete(String nome, String date, String hora){
        this.nome = nome;
        this.date = date;
        this.hora = hora;
    }


}

