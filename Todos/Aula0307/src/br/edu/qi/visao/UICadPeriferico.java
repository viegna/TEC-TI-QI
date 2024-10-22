/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.visao;

import br.edu.qi.modelo.Periferico;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogenes Wilgner
 * @since 03/07/2019 - 14:19
 * @version 1.0.1
 */
public class UICadPeriferico extends javax.swing.JInternalFrame {

    /**
     * Creates new form UICadPeriferico
     */
    public UICadPeriferico() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgCor = new javax.swing.ButtonGroup();
        jlpDados = new javax.swing.JLayeredPane();
        jlModelo = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jrbAzul = new javax.swing.JRadioButton();
        jrbPreto = new javax.swing.JRadioButton();
        jlQuantidade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jtfValorTotal = new javax.swing.JTextField();
        jlCor = new javax.swing.JLabel();
        jlModeloErro = new javax.swing.JLabel();
        jlValorErro = new javax.swing.JLabel();
        jlQuantidadeErro = new javax.swing.JLabel();
        jlCorErro = new javax.swing.JLabel();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlModelo.setText("Modelo");

        jlValor.setText("Valor");

        jbgCor.add(jrbAzul);
        jrbAzul.setText("Azul");
        jrbAzul.setActionCommand("Azul");

        jbgCor.add(jrbPreto);
        jrbPreto.setText("Preto");
        jrbPreto.setActionCommand("Preto");

        jlQuantidade.setText("Qtd");

        jLabel4.setText("Valor Total");

        jtfModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfModeloFocusLost(evt);
            }
        });

        jtfValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorFocusLost(evt);
            }
        });

        jtfQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfQuantidadeFocusLost(evt);
            }
        });

        jtfValorTotal.setEditable(false);
        jtfValorTotal.setFocusable(false);

        jlCor.setText("Cor");

        jlModeloErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png"))); // NOI18N
        jlModeloErro.setEnabled(false);

        jlValorErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png"))); // NOI18N
        jlValorErro.setEnabled(false);

        jlQuantidadeErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png"))); // NOI18N
        jlQuantidadeErro.setEnabled(false);

        jlCorErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png"))); // NOI18N
        jlCorErro.setEnabled(false);

        jlpDados.setLayer(jlModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbAzul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbPreto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlModeloErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlValorErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlQuantidadeErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCorErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jlValor)
                    .addComponent(jlQuantidade)
                    .addComponent(jlModelo)
                    .addComponent(jlCor))
                .addGap(153, 153, 153)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfQuantidade)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addComponent(jrbAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbPreto)))))
                        .addGap(122, 122, 122)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlModeloErro)
                            .addComponent(jlCorErro)
                            .addComponent(jlValorErro)
                            .addComponent(jlQuantidadeErro))))
                .addGap(130, 130, 130))
        );

        jlpDadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlCorErro, jlModeloErro, jlQuantidadeErro, jlValorErro});

        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModelo)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlModeloErro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAzul)
                    .addComponent(jrbPreto)
                    .addComponent(jlCor)
                    .addComponent(jlCorErro))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorErro))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantidadeErro))
                .addGap(18, 18, 18)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(88, 88, 88))
        );

        jlpDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlCorErro, jlModeloErro, jlQuantidadeErro, jlValorErro});

        jlpAcoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAcoes)
                    .addComponent(jlpDados))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpAcoes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void limpar() {
        jtfModelo.setText("");
        jtfQuantidade.setText("");
        jtfValor.setText("");
        jbgCor.clearSelection();
        jtfModelo.grabFocus();

        jlModeloErro.setVisible(false);
        jtfModelo.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jlModeloErro.setText("");
        jlCorErro.setVisible(false);
        jlCorErro.setText("");
        jlQuantidadeErro.setVisible(false);
        jtfQuantidade.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jlQuantidadeErro.setText("");
        jlValorErro.setVisible(false);
        jtfValor.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        jlValorErro.setText("");
        jtfValorTotal.setText("");
    }
    
    private void atualizarValorTotal() {
        if ( jtfValor.getText().isEmpty() || jtfQuantidade.getText().isEmpty()){
            
        } else {
            Periferico periferico = new Periferico();
            periferico.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
            periferico.setValor(Double.parseDouble(jtfValor.getText()));
            jtfValorTotal.setText("R$: " + String.valueOf(periferico.calcularValorTotal()) + " Reais");
        }
    }
    
    private void cadastrar() {
        try {
            if (jtfModelo.getText().isEmpty()) {
                throw new NumberFormatException("\nModelo Inválido!");
            }

            if (jtfQuantidade.getText().isEmpty()) {
                throw new NumberFormatException("\nQuantidade Inválida!");
            }

            if (jtfValor.getText().isEmpty()) {
                throw new NumberFormatException("\nValor Inválido!");
            }

            if (jbgCor.getSelection() == null) {
                throw new NumberFormatException("\nCor não selecionada!");
            }

            Periferico periferico = new Periferico();

            periferico.setCor(jbgCor.getSelection().getActionCommand());
            periferico.setModelo(jtfModelo.getText());
            periferico.setQuantidade(Integer.parseInt(jtfQuantidade.getText()));
            periferico.setValor(Double.parseDouble(jtfValor.getText()));

            JOptionPane.showMessageDialog(
                    rootPane,
                    "\nDados: " + periferico.toString());
            
            limpar();
            
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "\nErro! Dado Inválido!\n " + numberFormatException.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } catch (ArithmeticException arithmeticException) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "\nErro! Cálculo Inválido!\n " + arithmeticException.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "\nErro não identificado!\n" + exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        } finally {
            System.out.println("Passou aq c:");
        }
    }

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtfModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfModeloFocusLost
        jlModeloErro.setEnabled(true);
        if (jtfModelo.getText().isEmpty()) {
            jtfModelo.setBorder(BorderFactory.createLineBorder(Color.red));

            jlModeloErro.setVisible(true);
            jlModeloErro.setText("Modelo em branco!");
            jlModeloErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/cross.png")));
        } else {
            jtfModelo.setBorder(BorderFactory.createLineBorder(Color.green));
            jlModeloErro.setVisible(true);
            jlModeloErro.setText("");
            jlModeloErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png")));
        }
    }//GEN-LAST:event_jtfModeloFocusLost

    private void jtfValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorFocusLost
        jlValorErro.setEnabled(true);
        if (jtfValor.getText().isEmpty()) {

            jlValorErro.setVisible(true);
            jlValorErro.setText("Defina um Valor!");
            jlValorErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/cross.png")));
            jtfValor.setBorder(BorderFactory.createLineBorder(Color.red));
            
        } else {
            jlValorErro.setVisible(true);
            jlValorErro.setText("");
            jtfValor.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            jlValorErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png")));
            
        }
        atualizarValorTotal();
    }//GEN-LAST:event_jtfValorFocusLost

    private void verificarCor() {
        jlCorErro.setEnabled(true);
        
        if ( jbgCor.getSelection() == null ) {
            
             jlCorErro.setVisible(true);
             jlCorErro.setText("Selecione uma cor!");
             jlCorErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/cross.png")));
             
        } else {
            
            jlCorErro.setVisible(true);
            jlCorErro.setText("");
            jlCorErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png")));
            
        }
    }
    
    private void jtfValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorFocusGained
        verificarCor();
    }//GEN-LAST:event_jtfValorFocusGained

    private void jtfQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfQuantidadeFocusLost
        jlQuantidadeErro.setEnabled(true);
        
        if ( jtfQuantidade.getText().isEmpty() ) {
            
             jlQuantidadeErro.setVisible(true);
             jlQuantidadeErro.setText("Defina uma quantidade!"); 
             jlQuantidadeErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/cross.png")));
             jtfQuantidade.setBorder(BorderFactory.createLineBorder(Color.red));
             
        } else {
            
            jlQuantidadeErro.setText("");
            jlQuantidadeErro.setVisible(true);
            jtfQuantidade.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            jlQuantidadeErro.setIcon(new ImageIcon(getClass().getResource("/br/edu/qi/images/accept.png")));
        }
        atualizarValorTotal();
    }//GEN-LAST:event_jtfQuantidadeFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.ButtonGroup jbgCor;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlCorErro;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlModeloErro;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlQuantidadeErro;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlValorErro;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JRadioButton jrbAzul;
    private javax.swing.JRadioButton jrbPreto;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
