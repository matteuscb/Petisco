/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author matteus
 */
public class LancheDAO {

    private Connection conexao;

    public LancheDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }
}
