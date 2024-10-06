/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Conversor;

/**
 *
 * @author Diogenes W.  
 * @since 17/06/2019 - 16:37
 * @version 1.0.1 Beta Folhado
 */
public class Principal {
    public static void main(String[] args) {
        
        Conversor conversor = new Conversor();
        
        conversor.setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite sua idade: ",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE
        )));
        
        JOptionPane.showMessageDialog(
                null,
                conversor.toString(),
                "Tabela Convertida",
                JOptionPane.PLAIN_MESSAGE);
        
    }//fecha main
}//fecha classe
