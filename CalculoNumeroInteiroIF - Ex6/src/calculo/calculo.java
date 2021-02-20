package calculo;

import javax.swing.*;

public class calculo {
    public static void main(String[] args){
        int Leia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira Um Numero Inteiro:","Comando If",JOptionPane.INFORMATION_MESSAGE));

        if (Leia < 0 ){
            Leia = (-1) * Leia;

        }else {
            JOptionPane.showMessageDialog(null,"O Modulo eh ", "Comando If", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
