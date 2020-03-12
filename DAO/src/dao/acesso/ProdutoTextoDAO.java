/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.acesso;

import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
import comuns.vos.Funcionario;
import dao.DAO;
import java.sql.SQLException;
import comuns.vos.Produto;
import static dao.acesso.FuncionarioTextoDAO.escritor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitorlupinetti
 */
public class ProdutoTextoDAO extends DAO {

    public ProdutoTextoDAO(){
        super(Produto.class);
    }
    
    public static void escritor(String path, Entidade entidade) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        String linha = "";
        Produto p = (Produto)entidade;
        linha = p.getCategoria() + ";" + p.getDescricao() + ";" + p.getValor() + ";";

        buffWrite.append(linha + "\n");
        buffWrite.close();
        
        System.out.println("Produto cadastrado.");
    }
    @Override
    public Entidade seleciona(Entidade entidade, EntidadesDisponiveis enumEntidade) throws SQLException {
        return null;
    }

    @Override
    public void insere(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        
        String path = "/Users/vitorlupinetti/Desktop/Vitor/lp2/Joaozin-Vitin/DAO/src/dao/acesso/produto.txt";
        try {
             escritor(path, entidade);
           } catch (IOException ex) {
               Logger.getLogger(FuncionarioTextoDAO.class.getName()).log(Level.SEVERE, null, ex);
           }   
    }

    @Override
    public Entidade atualiza(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleta(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
