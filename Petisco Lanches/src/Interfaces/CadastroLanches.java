/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.LancheDAO;
import Modelos.Lanche;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matteus
 */
public class CadastroLanches extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroLanches
     */
    Lanche lanche;
    LancheDAO dao;

    public CadastroLanches() {
        super("Cadastro de Lanches");
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

        jLCabecalho = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLIngredientes = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTIngredientes = new javax.swing.JTextField();
        jTValor = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Lanches");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLIngredientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLIngredientes.setText("Ingredientes:");

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTIngredientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTValorKeyTyped(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLCabecalho)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLNome)
                            .addGap(18, 18, 18)
                            .addComponent(jTNome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLValor)
                            .addGap(18, 18, 18)
                            .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLIngredientes)
                        .addGap(18, 18, 18)
                        .addComponent(jTIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIngredientes)
                    .addComponent(jTIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("");
        jTIngredientes.setText("");
        jTValor.setText("");
        lanche = null;
        dao = null;
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            lanche = new Lanche();
            dao = new LancheDAO();
            lanche.setNome(jTNome.getText());
            lanche.setIngredientes(jTIngredientes.getText());
            lanche.setValor(Double.parseDouble(jTValor.getText().replace(',', '.')));
            dao.adicionar(lanche);
            JOptionPane.showMessageDialog(null, "Lanche Adicionado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTValorKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLIngredientes;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLValor;
    private javax.swing.JTextField jTIngredientes;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables
}
