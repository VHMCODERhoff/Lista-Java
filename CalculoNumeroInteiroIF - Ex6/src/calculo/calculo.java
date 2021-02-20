package calculo;

import javax.swing.*;

public class calculo {
    public static void main(String[] args){
        int Leia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Um Numero Inteiro:","Comando If",JOptionPane.INFORMATION_MESSAGE));

        if (Leia < 0 ){
            Leia = (-1) * Leia;
            JOptionPane.showMessageDialog(null,"O Numero Digitado eh Igual a 0 ou Maior a 0", "Comando If", JOptionPane.INFORMATION_MESSAGE);

        }else {
            JOptionPane.showMessageDialog(null,"O Numero Digitado eh menor que zero!", "Comando If", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
