package build.Calculadora;

public class Dados {
    
    private float valorUm;
    private float valorDois;
    public float resultSoma;
    public float resultSub;
    public float resultMult;
    public float resultDiv;

    public void soma(){
        resultSoma = getValorUm() + getValorDois();
    }

    public void subtracao(){
        resultSub = getValorUm() - getValorDois();
    }

    public void multplicacao(){
        resultMult = getValorUm() * getValorDois();
    }

    public void divisao(){
        resultDiv = getValorUm() / getValorDois();
    }

    public void setValorUm(float valorUm){
        this.valorUm = valorUm;
    }

    public float getValorUm(){
        return valorUm;
    }

    public void setValorDois(float valorDois){
        this.valorDois = valorDois;
    }

    public float getValorDois(){
        return valorDois;
    }
}
