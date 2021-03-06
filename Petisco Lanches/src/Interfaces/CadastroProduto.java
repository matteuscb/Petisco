/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import Modelos.Fornecedor;
import Modelos.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProduto
     */
    ProdutoDAO dao;
    Produto produto;
    List<Fornecedor> fornecedores = new ArrayList<>();
    FornecedorDAO fdao = new FornecedorDAO();

    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{
        "Nome", "CNPJ", "Cidade"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public CadastroProduto() {
        super("Cadastro de Produtos");
        initComponents();
        jTabela.setAutoResizeMode(jTabela.AUTO_RESIZE_OFF);
        jTabela.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTabela.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTabela.getColumnModel().getColumn(2).setPreferredWidth(240);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFornecedor = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLValidade = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTFornecedor = new javax.swing.JTextField();
        jTQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jDCValidade = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuantidade.setText("Quantidade:");

        jLValidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValidade.setText("Validade:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFornecedorKeyTyped(evt);
            }
        });

        jTQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabela.setModel(tmFornecedor);
        jTabela.setRowHeight(23);
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
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

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBLimpar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLFornecedor)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFornecedor))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLValidade)
                                .addGap(18, 18, 18)
                                .addComponent(jDCValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLCabecalho)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFornecedor)
                            .addComponent(jTFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQuantidade)
                            .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLValidade))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDCValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("");
        jTFornecedor.setText("");
        jTQuantidade.setText("");
        jDCValidade.setDate(null);
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }
        produto = null;
        dao = null;
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Integer quantidade = Integer.parseInt(jTQuantidade.getText());
        if (quantidade >= 0) {
            try {
                produto = new Produto();
                dao = new ProdutoDAO();

                produto.setNome(jTNome.getText());
                produto.setQuantidade(quantidade);
                produto.setFornecedor(fornecedores.get(jTabela.getSelectedRow()));
                produto.setData(jDCValidade.getDate());

                dao.adicionar(produto);
                JOptionPane.showMessageDialog(null, "Produto Adicionado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade não pode conter números negativos!");
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFornecedorKeyTyped
        try {
            fornecedores = fdao.listar("%" + jTFornecedor.getText() + "%");
            //"Nome", "CNPJ", "Cidade"}) {
            while (tmFornecedor.getRowCount() > 0) {
                tmFornecedor.removeRow(0);
            }

            String endereco;
            for (int i = 0; i < fornecedores.size(); i++) {
                tmFornecedor.addRow(new String[]{null, null, null, null});
                endereco = fornecedores.get(i).getCidade() + "/"
                        + fornecedores.get(i).getEstado();
                tmFornecedor.setValueAt(fornecedores.get(i).getNome(), i, 0);
                tmFornecedor.setValueAt(fornecedores.get(i).getCnpj(), i, 1);
                tmFornecedor.setValueAt(endereco, i, 2);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jTFornecedorKeyTyped

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        jTFornecedor.setText(fornecedores.get(jTabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_jTabelaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private com.toedter.calendar.JDateChooser jDCValidade;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLValidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFornecedor;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
