import javax.swing.*;
public class cotacao {
    public static void main(String[] args){
        float InserirDolar = 0.0F;
        float LeiaDolar = 0.0F;
        InserirDolar = Float.parseFloat(JOptionPane.showInputDialog (null, "Insira o valor da cotacao do dolar : ","Conversor", JOptionPane.QUESTION_MESSAGE ));
        System.out.print(InserirDolar);
        LeiaDolar = Float.parseFloat(JOptionPane.showInputDialog (null, "Insira o valor do dolar :  ","Conversor", JOptionPane.QUESTION_MESSAGE ));
        System.out.print(LeiaDolar);

        float cotacaoParaReal = (InserirDolar * LeiaDolar);
        JOptionPane.showMessageDialog(null,"O Resultado da conversao eh :" + " "  + cotacaoParaReal,"Resultado - Conversao",JOptionPane.QUESTION_MESSAGE);

    }

}
