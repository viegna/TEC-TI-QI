/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.visao;

import br.edu.qi.modelo.ParticipanteVO;
import br.edu.qi.servicos.ParticipanteServicos;
import br.edu.qi.servicos.ServicosFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rudimiler P. Machado
 * @since 10/06/2019 - 17:18
 * @version 1.0 beta
 */
public class UICadManutencaoParticipante extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel
            = new DefaultTableModel(
                    new Object[][]{},
                    new Object[]{"Código", "Nome", "Endereço", "Time", "CPF", "Numero", "Idade"}
            );
    /**
     * Creates new form GUICadManutencaoParticipante
     */
    public UICadManutencaoParticipante() {
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

        jlpDados = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableParticipante = new javax.swing.JTable();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfTime = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jtfIdade = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTime = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbPreencher = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Participante");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jtableParticipante.getTableHeader().setReorderingAllowed(false);
        jtableParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableParticipanteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableParticipante);
        if (jtableParticipante.getColumnModel().getColumnCount() > 0) {
            jtableParticipante.getColumnModel().getColumn(0).setResizable(false);
            jtableParticipante.getColumnModel().getColumn(1).setResizable(false);
            jtableParticipante.getColumnModel().getColumn(2).setResizable(false);
            jtableParticipante.getColumnModel().getColumn(3).setResizable(false);
        }

        jtfCodigo.setEnabled(false);

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlEndereco.setText("Endereço");

        jlTime.setText("Time");

        jlCPF.setText("CPF");

        jlIdade.setText("Idade");

        jlNumero.setText("Número");

        jlpDados.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNumero)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIdade)
                            .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jlNome)
                    .addComponent(jlEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTime)
                    .addComponent(jlCPF)
                    .addComponent(jlIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNumero)
                .addGap(9, 9, 9)
                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbPreencher.setText("Preencher");
        jbPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlpAcoes)
                    .addComponent(jlpDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void preencher() {
            try {
                
                ParticipanteServicos participanteServicos = ServicosFactory.getParticipanteServicos();
                ArrayList<ParticipanteVO> participantes = participanteServicos.buscarParticipantes();
                 
                for (int i = 0; i < participantes.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(participantes.get(i).getIdParticipante()),
                    participantes.get(i).getNome(),
                    participantes.get(i).getEndereco(),
                    participantes.get(i).getTime(),
                    participantes.get(i).getCPF(),
                    String.valueOf(participantes.get(i).getNumero()),
                    String.valueOf(participantes.get(i).getIdade()),
                });
            }//fecha for
                jtableParticipante.setModel(defaultTableModel);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(rootPane,
                        "Erro!" + exception.getMessage());
            }
    }//preencher
    
    private void deletar() {
        try {
            int linha = jtableParticipante.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(this,
                        "Selecione uma linha para excluir!");
                return;
            }//fecha if
            ParticipanteServicos participanteServicos
                    = ServicosFactory.getParticipanteServicos();
            String id
                    = jtableParticipante.getValueAt(linha, 0).toString();
            participanteServicos.deletarParticipante(Long.parseLong(id));

            JOptionPane.showMessageDialog(this,
                    "Participante excluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }//catch
    }//deletar
    
    private void alterar() {
        
        int linha = jtableParticipante.getSelectedRow();
        String id = jtableParticipante.getValueAt(linha, 0).toString();
        String nome = jtableParticipante.getValueAt(linha, 1).toString();
        String endereco = jtableParticipante.getValueAt(linha, 2).toString();
        String time = jtableParticipante.getValueAt(linha, 3).toString();
        String CPF = jtableParticipante.getValueAt(linha, 4).toString();
        String numero = jtableParticipante.getValueAt(linha, 5).toString();
        String idade = jtableParticipante.getValueAt(linha, 6).toString();

        jtfCodigo.setText(id);
        jtfNome.setText(nome);
        jtfEndereco.setText(endereco);
        jtfIdade.setText(idade);
        jtfTime.setText(time);
        jtfCPF.setText(CPF);
        jtfNumero.setText(numero);
    }//fecha alterar
    
    private void confirmarAlteracao() {
        try {
            ParticipanteVO participanteVO = new ParticipanteVO();
            participanteVO.setNome(jtfNome.getText());
            participanteVO.setEndereco(jtfEndereco.getText());
            participanteVO.setCPF(jtfCPF.getText());
            participanteVO.setTime(jtfTime.getText());
            participanteVO.setIdade(Integer.parseInt(jtfIdade.getText()));
            participanteVO.setNumero(Integer.parseInt(jtfNumero.getText()));
            
            ParticipanteServicos participanteServicos = ServicosFactory.getParticipanteServicos();
            participanteServicos.alterarParticipante(participanteVO);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Participante alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }//catch
    }//fecha confirmarAlteração
    
    
    
    private void limpar() {
        defaultTableModel.setNumRows(0);
    }//fecha limpar
    
    private void jbPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherActionPerformed
        limpar();
        preencher();
    }//GEN-LAST:event_jbPreencherActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
        limpar();
        preencher();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        confirmarAlteracao();
        preencher();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtableParticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableParticipanteMouseClicked
       alterar();
       
    }//GEN-LAST:event_jtableParticipanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPreencher;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlTime;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTable jtableParticipante;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfTime;
    // End of variables declaration//GEN-END:variables
}
