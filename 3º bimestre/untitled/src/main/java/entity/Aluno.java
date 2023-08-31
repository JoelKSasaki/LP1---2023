package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "aluno")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Aluno;
    @Column
    private String nome;
    @Column
    private String pront;
    @Column
    private String senha;
    @Column
    private double media;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "notaAluno")
    private List<Nota> notas;

    public Aluno(double media, String nome, String pront, String senha) {
        this.nome = nome;
        this.pront = pront;
        this.senha = senha;
        this.media = media;
    }

    public Long getId_Aluno() {
        return id_Aluno;
    }

    public void setId_Aluno(Long id_Aluno) {
        this.id_Aluno = id_Aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPront() {
        return pront;
    }

    public void setPront(String pront) {
        this.pront = pront;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id_Aluno=" + id_Aluno +
                ", nome='" + nome + '\'' +
                ", pront='" + pront + '\'' +
                ", senha='" + senha + '\'' +
                ", media=" + media +
                '}';
    }
}

