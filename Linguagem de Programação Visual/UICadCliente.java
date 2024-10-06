/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.visao;

import br.edu.qi.modelo.Cliente;
import br.edu.qi.servicos.ClienteServicos;
import br.edu.qi.servicos.ServicosFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogenes Wilgner
 * @version 1.0
 * @since 06/07/2019 - 16:28
 */
public class UICadCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form UICadCliente
     */
    public UICadCliente() {
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

        jbgTipoDePagamento = new javax.swing.ButtonGroup();
        jlpDados = new javax.swing.JLayeredPane();
        jlCPF = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jlRua = new javax.swing.JLabel();
        jlTipoDePagamento = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfNumero = new javax.swing.JTextField();
        jtfRua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResposta = new javax.swing.JTextArea();
        jrbDinheiro = new javax.swing.JRadioButton();
        jrbDebito = new javax.swing.JRadioButton();
        jrbCredito = new javax.swing.JRadioButton();
        jrbBitcoin = new javax.swing.JRadioButton();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCPF.setText("CPF");

        jlCidade.setText("Cidade");

        jlEstado.setText("Estado");

        jlNumero.setText("Numero");

        jlRua.setText("Rua");

        jlTipoDePagamento.setText("Tipo de Pagamento");

        jlNome.setText("Nome");

        jtaResposta.setColumns(20);
        jtaResposta.setRows(5);
        jScrollPane1.setViewportView(jtaResposta);

        jbgTipoDePagamento.add(jrbDinheiro);
        jrbDinheiro.setText("Dinheiro");
        jrbDinheiro.setActionCommand("Dinheiro");

        jbgTipoDePagamento.add(jrbDebito);
        jrbDebito.setText("Débito");
        jrbDebito.setActionCommand("Débito");

        jbgTipoDePagamento.add(jrbCredito);
        jrbCredito.setText("Crédito");
        jrbCredito.setActionCommand("Crédito");

        jbgTipoDePagamento.add(jrbBitcoin);
        jrbBitcoin.setText("Bitcoin");
        jrbBitcoin.setActionCommand("Bitcoin");

        jlpDados.setLayer(jlCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlTipoDePagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbDinheiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbDebito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbCredito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jrbBitcoin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jlTipoDePagamento)
                        .addGap(18, 18, 18)
                        .addComponent(jrbDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbDebito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbCredito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbBitcoin)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNome)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCPF)
                            .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCidade)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstado)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumero)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRua)
                            .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoDePagamento)
                    .addComponent(jrbDinheiro)
                    .addComponent(jrbDebito)
                    .addComponent(jrbCredito)
                    .addComponent(jrbBitcoin))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jbCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados)
                .addContainerGap())
            .addComponent(jlpAcoes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpar() {
        jtfCPF.setText("");
        jtfCidade.setText("");
        jtfEstado.setText("");
        jtfNome.setText("");
        jtfNumero.setText("");
        jtfRua.setText("");
        jtfNome.grabFocus();
        jtaResposta.setText("");
        jbgTipoDePagamento.clearSelection();
    }

    private void cadastrar() {
        try {
            //cenário Real!
            if (jtfNome.getText().isEmpty()) {
                throw new NumberFormatException("Nome inválido!");
            }

            if (jtfCPF.getText().isEmpty()) {
                throw new NumberFormatException("CPF Invalido");
            }

            if (jtfCidade.getText().isEmpty()) {
                throw new NumberFormatException("Cidade Invalida\n");
            }

            if (jtfEstado.getText().isEmpty()) {
                throw new NumberFormatException("Estado Invalido\n");
            }

            if (jtfNumero.getText().isEmpty()) {
                throw new NumberFormatException("Número Invalido\n");
            }

            if (jtfRua.getText().isEmpty()) {
                throw new NumberFormatException("Rua Invalida\n");
            }

            if (jbgTipoDePagamento.getSelection() == null) {
                throw new NumberFormatException("Escolha um método de pagamento!\n");
            }
            //dados cliente
            Cliente cliente = new Cliente();
            cliente.setCPF(jtfCPF.getText());
            cliente.setCidade(jtfCidade.getText());
            cliente.setEstado(jtfEstado.getText());
            cliente.setNome(jtfNome.getText());
            cliente.setNumero(Integer.parseInt(jtfNumero.getText()));
            cliente.setRua(jtfRua.getText());
            cliente.setTipoDePagamento(jbgTipoDePagamento.getSelection().getActionCommand());

            ClienteServicos clienteServicos = ServicosFactory.getClienteServicos();
            clienteServicos.cadastrarCliente(cliente);
            JOptionPane.showMessageDialog(rootPane, "Sucesso!\n Cliente cadastrado!");

        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro, dado inválido! " + numberFormatException.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException arithmeticException) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro aritmético! " + arithmeticException.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                    this,
                    "Algum erro ocorreu! " + exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        } finally {
            System.out.println("passou em finally c:");
        }
    }//fecha cadastrar

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.ButtonGroup jbgTipoDePagamento;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlTipoDePagamento;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JRadioButton jrbBitcoin;
    private javax.swing.JRadioButton jrbCredito;
    private javax.swing.JRadioButton jrbDebito;
    private javax.swing.JRadioButton jrbDinheiro;
    private javax.swing.JTextArea jtaResposta;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables
}
