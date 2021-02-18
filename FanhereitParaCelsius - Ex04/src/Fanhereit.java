import javax.swing.*;
public class Fanhereit {
    public static void main(String[] args){
        float Fanhreit = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor em Fanhreit:" + " ","Fanhreit Para Celsius!",JOptionPane.QUESTION_MESSAGE));
        float C = (Fanhreit - 32)* 5 / 9;
        JOptionPane.showMessageDialog(null,"O Resultado Da Conversao eh:" + " " + C,"Fanhreit Para Celsius!", JOptionPane.QUESTION_MESSAGE);
    }
}
