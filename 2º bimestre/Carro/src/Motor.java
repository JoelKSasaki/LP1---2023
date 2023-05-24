public class Motor {

    private int potencia;
    private double classificaçao;
    private int valvulas;

    public Motor(int potencia, double classificaçao, int valvulas){
        this.potencia = potencia;
        this.classificaçao = classificaçao;
        this.valvulas = valvulas;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public double getClassificaçao(){
        return classificaçao;
    }

    public void setClassificaçao(double classificaçao){
        this.classificaçao = classificaçao;
    }

    public int getValvulas(){
        return valvulas;
    }

    public void setValvulas(int valvulas){
        this.valvulas = valvulas;
    }
}
