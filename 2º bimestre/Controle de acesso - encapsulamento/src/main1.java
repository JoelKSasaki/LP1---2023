public class main1 {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Joel", 16);

        pessoa1.dadospessoais();

        System.out.println(pessoa1.getNome());

        System.out.println(pessoa1.setIdade(11));
        System.out.println(pessoa1.getIdade());
    }
}
