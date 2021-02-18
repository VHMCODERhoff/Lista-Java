import javax.swing.*;

public class main {
    public static void main(String[] args){
        int Leia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero inteiro:" + " ", "Comando - Switch Case", JOptionPane.INFORMATION_MESSAGE));
        switch(Leia){
            case 1:
                JOptionPane.showMessageDialog(null, Leia, "Codigo Valido!", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, Leia, "Codigo Valido!", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, Leia, "Codigo Valido!", JOptionPane.INFORMATION_MESSAGE);
                break;
                default:JOptionPane.showMessageDialog(null,"Codigo Invalido!");
        }
    }
}
