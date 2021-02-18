package Application;

import javax.swing.*;

public class Estoque {

    public static void main(String[] args) {

        int QuantidadeMaxima,QuantidadeMinima,EstoqueMedio;

        QuantidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a capacidade maxima:","Estoque", JOptionPane.QUESTION_MESSAGE));
        System.out.print(QuantidadeMaxima);

        QuantidadeMinima = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a capacidade minima:","Estoque", JOptionPane.QUESTION_MESSAGE));
        System.out.print(QuantidadeMinima);
        EstoqueMedio = (QuantidadeMaxima + QuantidadeMinima) / 2;
        JOptionPane.showMessageDialog(null,"O estoque medio é:" + " " + EstoqueMedio) ;

    }
}
