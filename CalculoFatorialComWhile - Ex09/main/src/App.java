import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero :", "Calculador De Fatorial", JOptionPane.INFORMATION_MESSAGE));
                int Fatorial = 1;
                while (Numero>1)
                { 
                    Fatorial = Fatorial * Numero;
                    Numero = Numero - 1;
                    System.out.print(Fatorial + " ");
                }
                  
       
    }
}
