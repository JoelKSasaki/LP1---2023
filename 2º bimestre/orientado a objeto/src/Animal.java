public class Animal {
    public String nome;
    public int idade;
    public String barulho;

    public Animal(String nome, int idade, String barulho){
        System.out.println("Adotei um animal!");
        this.nome = nome;
        this.idade = idade;
        this.barulho = barulho;
    }

    public void fazerbarulho(){
        System.out.println(barulho);
    }

    public int envelhece(int idade){

        idade++;
        System.out.println(idade);
        return idade;
    }

}
