/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Fornecedor;
import Modelos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matteus
 */
public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Produto produto) throws SQLException {
        String sql = "insert into produtos (pro_nome,pro_quantidade,pro_validade,pro_fornecedor) values (?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDate(3, new java.sql.Date(produto.getData().getTime()));
            stmt.setInt(4, produto.getFornecedor().getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Produto> listarProduto(String nome) throws SQLException {
        String sql = "select * from produtos inner join fornecedores on"
                + " produtos.pro_fornecedor = fornecedores.for_id "
                + "where pro_nome ilike ? order by pro_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {
            Produto produto = new Produto();
            Fornecedor fornecedor = new Fornecedor();
            produto.setId(rs.getInt("pro_id"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setData(rs.getDate("pro_validade"));
            produto.setQuantidade(rs.getInt("pro_quantidade"));
            fornecedor.setNome(rs.getString("for_nome"));
            produto.setFornecedor(fornecedor);
            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }

    public List<Produto> listarFornecedor(String nome) throws SQLException {
        String sql = "select * from produtos inner join fornecedores on"
                + " produtos.pro_fornecedor = fornecedores.for_id "
                + "where for_nome ilike ? order by pro_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {
            Produto produto = new Produto();
            Fornecedor fornecedor = new Fornecedor();
            produto.setId(rs.getInt("pro_id"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setData(rs.getDate("pro_validade"));
            produto.setQuantidade(rs.getInt("pro_quantidade"));
            fornecedor.setNome(rs.getString("for_nome"));
            produto.setFornecedor(fornecedor);
            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }
}
