import java.util.ArrayList;
public class Cliente {
    private String nome;
    private int cpf;
    private String tel;

    public Cliente(String nome, int cpf, String tel){
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
