import javax.swing.*;

public class Conversor {
    public static void main(String[] args){
        float Celsius = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor em Celsius:" + " ","Celsius Para Farenheit!",JOptionPane.QUESTION_MESSAGE));
        float F = (9 * Celsius + 160);
        JOptionPane.showMessageDialog(null,"O Resultado Da Conversao eh:" + " " + F,"Celsius Para Forenheit!", JOptionPane.QUESTION_MESSAGE);
    }
}
