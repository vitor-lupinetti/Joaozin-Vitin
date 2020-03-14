/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.acesso;

import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
import dao.DAO;
import java.sql.SQLException;
import comuns.vos.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 082170017
 */
public class ClienteTextoDAO extends DAO{
    
    public ClienteTextoDAO(){
        super(Cliente.class);
    }
    
        
    public static void escritor(String path, Entidade entidade) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        String linha = "";
        Cliente c = (Cliente)entidade;
        linha = c.getNome() + ";" + c.getEndereço()+ ";" + c.getTelefone();

        buffWrite.append(linha + "\n");
        buffWrite.close();
        
        System.out.println("Cliente cadastrado.");
    }
    
    @Override
    public Entidade seleciona(Entidade entidade, EntidadesDisponiveis enumEntidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(Entidade entidade, EntidadesDisponiveis enumEntidade) {
    String path = "C:/Joaozin-Vitin/DAO/src/dao/acesso/cliente.txt";    
        try {
             escritor(path, entidade);
           } catch (IOException ex) {
               Logger.getLogger(ClienteTextoDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    @Override
    public void lista(EntidadesDisponiveis enumEntidade)throws IOException  {
        String path = "C:/Joaozin-Vitin/DAO/src/dao/acesso/cliente.txt";
    	String vetor [];                
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
                  
        String linha = "";
        
        while (true) {

            linha = buffRead.readLine();
            if(linha == null)
                break;                        
            vetor = linha.split(";");
            
            System.out.println("Cliente:" + vetor[0] +", Endereço: " + vetor[1] + ", Telefone:" + vetor[2]);            
            
        }
        buffRead.close();
    }
    
}
