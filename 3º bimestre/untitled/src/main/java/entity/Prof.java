package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prof")

public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profId;
    @Column
    private String nome;
    @Column
    private String pront;
    @Column
    private String cpf;
    @Column
    private String senha;

    public Prof(String nome, String pront, String cpf, String senha) {
        this.nome = nome;
        this.pront = pront;
        this.cpf = cpf;
        this.senha = senha;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Prof{" +
                "profId=" + profId +
                ", nome='" + nome + '\'' +
                ", pront='" + pront + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
