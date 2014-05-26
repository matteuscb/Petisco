/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Fornecedor;
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
public class FornecedorDAO {

    private Connection conexao;

    public FornecedorDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Fornecedor fornecedor) throws SQLException {
        String sql = "insert into fornecedores (for_nome,for_cnpj,for_email,for_rua,for_num,for_bairro,"
                + "for_cidade,for_estado,for_cep) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEmail());
            stmt.setString(4, fornecedor.getRua());
            stmt.setString(5, fornecedor.getNum());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCep());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Fornecedor> listar(String nome) throws SQLException {
        String sql = "select * from fornecedores where for_nome ilike ? order by for_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Fornecedor> fornecedores = new ArrayList<>();

        while (rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getInt("for_id"));
            fornecedor.setNome(rs.getString("for_nome"));
            fornecedor.setEmail(rs.getString("for_email"));
            fornecedor.setCnpj(rs.getString("for_cnpj"));
            fornecedor.setRua(rs.getString("for_rua"));
            fornecedor.setNum(rs.getString("for_num"));
            fornecedor.setBairro(rs.getString("for_bairro"));
            fornecedor.setCidade(rs.getString("for_cidade"));
            fornecedor.setEstado(rs.getString("for_estado"));
            fornecedor.setCep(rs.getString("for_cep"));
            fornecedores.add(fornecedor);
        }
        rs.close();
        pstmt.close();
        return fornecedores;
    }

    public List<Fornecedor> ListarCNPJ(String cnpj) throws SQLException {
        String sql = "select * from fornecedores where for_cnpj = ? order by for_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, cnpj);

        ResultSet rs = pstmt.executeQuery();
        List<Fornecedor> fornecedores = new ArrayList<>();

        while (rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getInt("for_id"));
            fornecedor.setNome(rs.getString("for_nome"));
            fornecedor.setEmail(rs.getString("for_email"));
            fornecedor.setCnpj(rs.getString("for_cnpj"));
            fornecedor.setRua(rs.getString("for_rua"));
            fornecedor.setNum(rs.getString("for_num"));
            fornecedor.setBairro(rs.getString("for_bairro"));
            fornecedor.setCidade(rs.getString("for_cidade"));
            fornecedor.setEstado(rs.getString("for_estado"));
            fornecedor.setCep(rs.getString("for_cep"));
            fornecedores.add(fornecedor);
        }
        rs.close();
        pstmt.close();
        return fornecedores;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from fornecedores where for_id=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    /*public void alterar(Cliente cliente) throws SQLException {
     String sql = "update cliente set cli_nome = ?,cli_datanasc = ?, cli_telefone = ?,cli_celular = ?, cli_cpf = ?,"
     + "cli_rg = ?,cli_email = ?,cli_rua = ?, cli_numero = ?, cli_bairro = ?,cli_cidade = ?"
     + " where cli_codigo = ?";
     PreparedStatement stmt = this.conexao.prepareStatement(sql);
     stmt.setString(1, cliente.getNome());
     stmt.setDate(2, new java.sql.Date(cliente.getNascimento().getTime()));
     stmt.setString(3, cliente.getTelefone());
     stmt.setString(4, cliente.getCelular());
     stmt.setString(5, cliente.getCpf());
     stmt.setString(6, cliente.getRg());
     stmt.setString(7, cliente.getEmail());
     stmt.setString(8, cliente.getRua());
     stmt.setString(9, cliente.getNumero());
     stmt.setString(10, cliente.getBairro());
     stmt.setString(11, cliente.getCidade());
     stmt.setInt(12, cliente.getId());
     stmt.execute();
     stmt.close();
     }*/
}
