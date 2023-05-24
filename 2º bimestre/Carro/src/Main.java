import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        car carro = new car("Vermelho", "FR22", "Ferrari",2022, "GRS1248", new Motor(20, 4, 25));

        ArrayList<Roda> roda = new ArrayList<Roda>();
        roda.add(new Roda(17, 30));
        roda.add(new Roda(17, 30));
        roda.add(new Roda(17, 30));
        roda.add(new Roda(17, 30));
    }
}
