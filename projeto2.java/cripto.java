import javax.swing.JOptionPane;


public class cripto {
           public static void main(String[] args){
               String nome = JOptionPane.showInputDialog ("Digite o Nome: ");
               String sobrenome = JOptionPane.showInputDialog ("Digite o sobrenome: ");
               String nomeCompleto = nome+" "+ sobrenome;
               JOptionPane.showMessageDialog (null, "Nome Completo: "+ nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);

           }


    
}
