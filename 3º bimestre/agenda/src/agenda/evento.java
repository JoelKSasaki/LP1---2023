package agenda;
import java.util.ArrayList;
import java.util.List;

public class evento{
    private String nome;
    private String date;
    private String horainicio;
    private String horafim;
    private String descrição;
    private List<evento> Evento = new ArrayList<>();

    public evento (String nome, String date, String horainicio, String horafim, String descrição){
        this.nome = nome;
        this.date = date;
        this.horainicio = horainicio;
        this.horafim = horafim;
        this.descrição = descrição;
    }

    public List<evento> getEvento(){
        return Evento;
    }

    public void setEvento (List<evento> Evento){
        this.Evento = Evento;
    }

    public void addEvento(evento evento){
        Evento.add(evento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafim() {
        return horafim;
    }

    public void setHorafim(String horafim) {
        this.horafim = horafim;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
