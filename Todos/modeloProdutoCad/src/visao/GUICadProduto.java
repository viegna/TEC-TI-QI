/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.ProdutoVO;

/**
 * @author Thiago Cury
 * @version 1.0 beta
 * @since 07/04/2014
 */
public class GUICadProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadProduto
     */
    public GUICadProduto() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlValorCusto = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtValorCusto = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("cadastro de produto");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");
        jlNome.setBounds(20, 30, 60, 18);
        jLayeredPane1.add(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlValorCusto.setText("Valor Custo");
        jlValorCusto.setBounds(20, 80, 100, 18);
        jLayeredPane1.add(jlValorCusto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlQuantidade.setText("Quantidade");
        jlQuantidade.setBounds(20, 130, 100, 18);
        jLayeredPane1.add(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtNome.setBounds(110, 20, 170, 28);
        jLayeredPane1.add(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtValorCusto.setBounds(110, 70, 170, 28);
        jLayeredPane1.add(jtValorCusto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jtQuantidade.setBounds(110, 120, 170, 28);
        jLayeredPane1.add(jtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.setBounds(30, 20, 110, 30);
        jLayeredPane2.add(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.setBounds(160, 20, 110, 30);
        jLayeredPane2.add(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar() {
        try {
            ProdutoVO pVO = new ProdutoVO();
            pVO.setNome(jtNome.getText());
            pVO.setValorCusto(Double.parseDouble(jtValorCusto.getText()));
            pVO.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
            
            /* Aqui você deve colocar o código para 
             * inserir o objeto no banco de dados */
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Produto cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
        
    }//fecha método cadastrar

    private void limpar() {
        jtNome.setText("");
        jtValorCusto.setText("");
        jtQuantidade.setText("");
    }//fecha método limpar

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValorCusto;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValorCusto;
    // End of variables declaration//GEN-END:variables
}
