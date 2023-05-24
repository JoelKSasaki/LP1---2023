import java.util.ArrayList;

public class car {
    private String cor;
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private Motor motor;
    private ArrayList<Roda> roda = new ArrayList<Roda>();


    public car(String cor, String modelo, String marca, int ano, String placa, Motor motor){
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.placa = placa;
    }

    public void Roda(Roda roda){
        this.roda.add(roda);
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
