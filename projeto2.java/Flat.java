import javax.swing.JOptionPane;
public class Flat {
    public static void main(String[] args) {
        float nota1, nota2, calcularMedia;
nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
calcularMedia = (nota1 + nota2)/2;

JOptionPane.showMessageDialog(null, "Média final: " + calcularMedia,
"Média", JOptionPane.INFORMATION_MESSAGE);
    }      
}