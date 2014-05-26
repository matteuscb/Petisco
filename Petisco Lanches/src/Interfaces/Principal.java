/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matteus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        super("Petisco Lanches");
        initComponents();

        this.setResizable(false);
        this.setFocusable(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/icone.png")));
        this.setSize(1000, 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jMFornecedor = new javax.swing.JMenu();
        jMICadastrarFornecedor = new javax.swing.JMenuItem();
        jMIPesquisarFornecedor = new javax.swing.JMenuItem();
        jMEstoque = new javax.swing.JMenu();
        jMICadastrarProduto = new javax.swing.JMenuItem();
        jMIPesquisarProduto = new javax.swing.JMenuItem();
        jMLanche = new javax.swing.JMenu();
        jMICadastrarLanche = new javax.swing.JMenuItem();
        jMIPesquisarLanche = new javax.swing.JMenuItem();
        jMPedido = new javax.swing.JMenu();
        jMICadastrarPedido = new javax.swing.JMenuItem();
        jMIPesquisarPedido = new javax.swing.JMenuItem();
        jMICalculadora = new javax.swing.JMenuItem();
        jMCaixa = new javax.swing.JMenu();
        JMIFechamento = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jMFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        jMFornecedor.setText("Fornecedores");
        jMFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrarFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrarFornecedor.setText("Cadastrar Fornecedor");
        jMICadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarFornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMICadastrarFornecedor);

        jMIPesquisarFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisarFornecedor.setText("Pesquisar Fornecedor");
        jMIPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarFornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMIPesquisarFornecedor);

        jMenu.add(jMFornecedor);

        jMEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_bau.png"))); // NOI18N
        jMEstoque.setText("Estoque");
        jMEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrarProduto.setText("Cadastrar Produto");
        jMICadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarProdutoActionPerformed(evt);
            }
        });
        jMEstoque.add(jMICadastrarProduto);

        jMIPesquisarProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisarProduto.setText("Pesquisar Produto");
        jMIPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarProdutoActionPerformed(evt);
            }
        });
        jMEstoque.add(jMIPesquisarProduto);

        jMenu.add(jMEstoque);

        jMLanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lanchonetes_icone.png"))); // NOI18N
        jMLanche.setText("Lanches");
        jMLanche.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrarLanche.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrarLanche.setText("Cadastrar Lanche");
        jMICadastrarLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarLancheActionPerformed(evt);
            }
        });
        jMLanche.add(jMICadastrarLanche);

        jMIPesquisarLanche.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisarLanche.setText("Pesquisar Lanche");
        jMIPesquisarLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarLancheActionPerformed(evt);
            }
        });
        jMLanche.add(jMIPesquisarLanche);

        jMenu.add(jMLanche);

        jMPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agenda.png"))); // NOI18N
        jMPedido.setText("Pedidos");
        jMPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastrarPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastrarPedido.setText("Cadastrar Pedido");
        jMICadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarPedidoActionPerformed(evt);
            }
        });
        jMPedido.add(jMICadastrarPedido);

        jMIPesquisarPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisarPedido.setText("Pesquisar Pedido");
        jMIPesquisarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarPedidoActionPerformed(evt);
            }
        });
        jMPedido.add(jMIPesquisarPedido);

        jMICalculadora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICalculadora.setText("Calculadora");
        jMICalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICalculadoraActionPerformed(evt);
            }
        });
        jMPedido.add(jMICalculadora);

        jMenu.add(jMPedido);

        jMCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/maquina.png"))); // NOI18N
        jMCaixa.setText("Caixa");
        jMCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JMIFechamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JMIFechamento.setText("Fechamento de Caixa");
        JMIFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFechamentoActionPerformed(evt);
            }
        });
        jMCaixa.add(JMIFechamento);

        jMenu.add(jMCaixa);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarFornecedorActionPerformed
        try {
            CadastroFornecedores cf = new CadastroFornecedores();
            jPanel.add(cf);
            cf.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMICadastrarFornecedorActionPerformed

    private void jMIPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarFornecedorActionPerformed
        try {
            PesquisaFornecedores pf = new PesquisaFornecedores();
            jPanel.add(pf);
            pf.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIPesquisarFornecedorActionPerformed

    private void jMICadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarProdutoActionPerformed
        CadastroProduto cp = new CadastroProduto();
        jPanel.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMICadastrarProdutoActionPerformed

    private void jMIPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarProdutoActionPerformed
        PesquisaProduto pp = new PesquisaProduto();
        jPanel.add(pp);
        pp.setVisible(true);
    }//GEN-LAST:event_jMIPesquisarProdutoActionPerformed

    private void jMICadastrarLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarLancheActionPerformed
        CadastroLanches cl = new CadastroLanches();
        jPanel.add(cl);
        cl.setVisible(true);
    }//GEN-LAST:event_jMICadastrarLancheActionPerformed

    private void jMIPesquisarLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarLancheActionPerformed
        PesquisaLanches pl = new PesquisaLanches();
        jPanel.add(pl);
        pl.setVisible(true);
    }//GEN-LAST:event_jMIPesquisarLancheActionPerformed

    private void jMICadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarPedidoActionPerformed
        CadastroPedidos cp = new CadastroPedidos();
        jPanel.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMICadastrarPedidoActionPerformed

    private void jMIPesquisarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarPedidoActionPerformed
        PesquisaPedidos pp = new PesquisaPedidos();
        jPanel.add(pp);
        pp.setVisible(true);
    }//GEN-LAST:event_jMIPesquisarPedidoActionPerformed

    private void jMICalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICalculadoraActionPerformed
        try {
            Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
        } catch (IOException e) {

        }
    }//GEN-LAST:event_jMICalculadoraActionPerformed

    private void JMIFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFechamentoActionPerformed
        try {
            FechamentoCaixa fc = new FechamentoCaixa();
            jPanel.add(fc);
            fc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMIFechamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIFechamento;
    private javax.swing.JMenu jMCaixa;
    private javax.swing.JMenu jMEstoque;
    private javax.swing.JMenu jMFornecedor;
    private javax.swing.JMenuItem jMICadastrarFornecedor;
    private javax.swing.JMenuItem jMICadastrarLanche;
    private javax.swing.JMenuItem jMICadastrarPedido;
    private javax.swing.JMenuItem jMICadastrarProduto;
    private javax.swing.JMenuItem jMICalculadora;
    private javax.swing.JMenuItem jMIPesquisarFornecedor;
    private javax.swing.JMenuItem jMIPesquisarLanche;
    private javax.swing.JMenuItem jMIPesquisarPedido;
    private javax.swing.JMenuItem jMIPesquisarProduto;
    private javax.swing.JMenu jMLanche;
    private javax.swing.JMenu jMPedido;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jPanel;
    // End of variables declaration//GEN-END:variables
}
