public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        System.out.println("Criei uma nova pessoa!");
        this.nome = nome;
        this.idade = idade;
    }

    public void dadospessoais(){
        System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade + " anos ");
    }

    public String getNome() {
        return nome;
    }

    public String setIdade(int idade){
        if(idade<this.idade){
            return "Inválido";
        }
        else{
            this.idade = idade;
            return "Válido";
        }
    }

    public int getIdade(){
        return idade;
    }
}