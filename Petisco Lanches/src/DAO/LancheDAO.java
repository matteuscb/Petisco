/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelos.Lanche;
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
public class LancheDAO {

    private Connection conexao;

    public LancheDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Lanche lanche) throws SQLException {
        String sql = "insert into lanches (lan_nome,lan_ingredientes,lan_valor) "
                + "values (?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, lanche.getNome());
            stmt.setString(2, lanche.getIngredientes());
            stmt.setDouble(3, lanche.getValor());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Lanche> listar(String nome) throws SQLException {
        String sql = "select * from lanches where lan_nome ilike ? order by lan_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Lanche> lanches = new ArrayList<>();

        while (rs.next()) {
            Lanche lanche = new Lanche();
            lanche.setId(rs.getInt("lan_id"));
            lanche.setNome(rs.getString("lan_nome"));
            lanche.setIngredientes(rs.getString("lan_ingredientes"));
            lanche.setValor(rs.getDouble("lan_valor"));
            lanches.add(lanche);
        }
        rs.close();
        pstmt.close();
        return lanches;
    }
}
