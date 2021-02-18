package calculo;

import javax.swing.*;

public class calculo {
    public static void main(String[] args){
        float Raio = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor do Raio:"+ " ", "Calculo - Raio - Volume - Altura", JOptionPane.INFORMATION_MESSAGE));
        float Altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor da Altura:"+ " ", "Calculo - Raio - Volume - Altura", JOptionPane.INFORMATION_MESSAGE));
        float V = 3.14159F;
        float calculo = (Raio * Altura * V);
        JOptionPane.showMessageDialog(null,"O Valor e o Volume de uma lata de oleo eh:" + " " + calculo);
    }
}
