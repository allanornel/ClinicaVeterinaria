/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Pessoa;

/**
 *
 * @author iapereira
 */
public class PessoaDAO {
    // conexao
    private ConexaoPostgreSQL conexaoPostgreSQL;
    // comando
    private PreparedStatement select;
    private PreparedStatement selectAll;
    private PreparedStatement insert;

    public PessoaDAO() {
        // instanciacao do objeto de conexao
        try {
            this.conexaoPostgreSQL = new ConexaoPostgreSQL();
            // instrucoes SQL
            this.select = this.conexaoPostgreSQL.getConnection().prepareStatement("select * from pessoa where id = ?;");
            this.selectAll = this.conexaoPostgreSQL.getConnection().prepareStatement("select * from pessoa");
            this.insert = this.conexaoPostgreSQL.getConnection().prepareStatement(
                    "INSERT INTO pessoa(nome, origem, cpf) VALUES (?, ?, ?);");

        } catch (Exception ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean adicionar(Pessoa pessoa)  {
        try {
            this.insert.setString(1, pessoa.getNome());
            this.insert.setString(2, pessoa.getOrigem());
            this.insert.setString(3, pessoa.getCpf());
            return !this.insert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    

}
