package build.Calculadora;

import javax.swing.JOptionPane;

public class Resultado {
    public static void main(String[] args) {
        
        Dados numero = new Dados();
        String confirm;

        numero.setValorUm(Float.parseFloat(JOptionPane.showInputDialog("Informe o Primeiro Valor: ")));
        numero.setValorDois(Float.parseFloat(JOptionPane.showInputDialog("Informe o Segundo Valor: ")));

        confirm = JOptionPane.showInputDialog("Informe o tipo de calculo que deseja: + (Adicao), - (Subtracao), x (Multiplicacao), / (Divisao)");

        if (confirm.equals("+")) {
            numero.soma();

            JOptionPane.showMessageDialog(null, "A soma de " + numero.getValorUm() + " + " + numero.getValorDois() + " = " + numero.resultSoma);
        }

        else if (confirm.equals("-")) {
            numero.subtracao();

            JOptionPane.showMessageDialog(null, "A subtracao de " + numero.getValorUm() + " - " + numero.getValorDois() + " = " + numero.resultSub);
        }

        else if (confirm.equals("x") || confirm.equals("X")) {
            numero.multplicacao();

            JOptionPane.showMessageDialog(null, "A multplicacao de " + numero.getValorUm() + " x " + numero.getValorDois() + " = " + numero.resultMult);
        }

        else if (confirm.equals("/")) {
            numero.divisao();

            JOptionPane.showMessageDialog(null, "A divisao de " + numero.getValorUm() + " / " + numero.getValorDois() + " = " + numero.resultDiv);
        }

    }
}
