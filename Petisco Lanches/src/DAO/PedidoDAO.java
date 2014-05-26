/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Pedido;
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
public class PedidoDAO {

    private Connection conexao;

    public PedidoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Pedido pedido) throws SQLException {
        String sql = "insert into pedidos (ped_cliente,ped_valor,ped_pedido,ped_endereco) "
                + "values (?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, pedido.getCliente());
            stmt.setDouble(2, pedido.getValor());
            stmt.setString(3, pedido.getPedido());
            stmt.setString(4, pedido.getEndereco());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Pedido> listar() throws SQLException {
        String sql = "select * from pedidos order by ped_cliente";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        List<Pedido> pedidos = new ArrayList<>();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setId(rs.getInt("ped_id"));
            pedido.setCliente(rs.getString("ped_cliente"));
            pedido.setValor(rs.getDouble("ped_valor"));
            pedido.setPedido(rs.getString("ped_pedido"));
            pedido.setEndereco(rs.getString("ped_endereco"));

            pedidos.add(pedido);
        }
        rs.close();
        pstmt.close();
        return pedidos;
    }

    public List<Pedido> listarTudo(String nome) throws SQLException {
        String sql = "select * from pedidos where ped_cliente ilike ? order by ped_cliente";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Pedido> pedidos = new ArrayList<>();

        while (rs.next()) {
            Pedido pedido = new Pedido();
            pedido.setId(rs.getInt("ped_id"));
            pedido.setCliente(rs.getString("ped_cliente"));
            pedido.setValor(rs.getDouble("ped_valor"));
            pedido.setPedido(rs.getString("ped_pedido"));
            pedido.setEndereco(rs.getString("ped_endereco"));
            pedidos.add(pedido);
        }
        rs.close();
        pstmt.close();
        return pedidos;
    }

    public void limpar() throws SQLException {
        String sql = "truncate pedidos";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }

}
