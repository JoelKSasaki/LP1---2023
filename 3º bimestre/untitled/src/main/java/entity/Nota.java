package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "boletim")

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boletimId;
    @Column
    private double nota;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Nota(double nota) {
        this.nota = nota;
    }

    public Long getBoletimId() {
        return boletimId;
    }

    public void setBoletimId(Long boletimId) {
        this.boletimId = boletimId;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "boletimId=" + boletimId +
                ", nota=" + nota +
                ", turma=" + turma +
                '}';
    }
}
