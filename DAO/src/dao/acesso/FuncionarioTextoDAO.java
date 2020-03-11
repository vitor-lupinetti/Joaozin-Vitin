/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.acesso;

import comuns.crud.basis.Entidade;
import comuns.crud.basis.FabricaEntidades;
import comuns.enums.EntidadesDisponiveis;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import comuns.vos.Funcionario;
import dao.DAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitorlupinetti
 */
public class FuncionarioTextoDAO extends DAO {
       private final ConcurrentHashMap<String, Funcionario> funcionarios = new ConcurrentHashMap<>();
    
    public FuncionarioTextoDAO()
    { 
        super(Funcionario.class);
        
    }
    
    public static Funcionario leitor(String path, Entidade entidade) throws IOException {
        String vetor [];
        Funcionario f = (Funcionario)entidade;
        Funcionario retorno = null;
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
            
        vetor = linha.split(";");
       
        if(vetor[1].equals(f.getUsername()))
        {
            retorno = new Funcionario();
            retorno.setNome(vetor[0]);
            retorno.setUsername(vetor[1]);
            retorno.setSenha(vetor[2]);
            retorno.setAcesso(vetor[3]);
            return retorno;
        }
        }
        buffRead.close();
        return retorno;
    }
 

    @Override
    public Entidade insere(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entidade seleciona(Entidade entidade, EntidadesDisponiveis enumEntidade) throws SQLException {
        Funcionario entidadeRetorno = new Funcionario();
        String path = "/Users/vitorlupinetti/Desktop/Vitor/lp2/Joaozin-Vitin/DAO/src/dao/acesso/funcionario.txt";
           try {
                entidadeRetorno = leitor(path, entidade);
           } catch (IOException ex) {
               Logger.getLogger(FuncionarioTextoDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           return entidadeRetorno;
    }

    @Override
    public void deleta(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entidade atualiza(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
