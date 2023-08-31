package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turma")

public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turmaId;
    @Column
    private String cod;
    @Column
    private int hora;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nomes")
    private List<Aluno> alunos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "turma_prof", joinColumns = @JoinColumn(name = "turma_id"), inverseJoinColumns = @JoinColumn(name = "prof_id"))
    private List<Prof> prof;

    public Turma(String cod, int hora) {
        this.cod = cod;
        this.hora = hora;
        this.alunos = new ArrayList<>();
    }

    public Long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Long turmaId) {
        this.turmaId = turmaId;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "turmaId=" + turmaId +
                ", cod='" + cod + '\'' +
                ", hora=" + hora +
                ", alunos=" + alunos +
                ", prof=" + prof +
                '}';
    }
}
