/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.acesso;

import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
import comuns.vos.Pedido;
import dao.DAO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 082170017
 */
public class PedidoTextoDAO extends DAO{
    public PedidoTextoDAO ()
    {
        super(Pedido.class);
    }
    public String path = "C:/Joaozin-Vitin/DAO/src/dao/acesso/pedido.txt";
    
    public static void escritor(String caminho, Entidade entidade) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho,true));
        String linha = "";
        Pedido p = (Pedido)entidade;
        linha = p.getClienteNome() + ";" + p.getVendedor()+ ";" + p.getQtdProdutos()+ ";" + p.getProdutos();

        buffWrite.append(linha + "\n");
        buffWrite.close();
        
        System.out.println("Pedido cadastrado.");
    }

    @Override
    public Entidade seleciona(Entidade entidade, EntidadesDisponiveis enumEntidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(Entidade entidade, EntidadesDisponiveis enumEntidade) {
        
        try {
             escritor(path, entidade);
           } catch (IOException ex) {
               Logger.getLogger(PedidoTextoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public void lista(EntidadesDisponiveis enumEntidade) throws IOException {
        String path = "C:/Joaozin-Vitin/DAO/src/dao/acesso/pedido.txt";
    	String vetor [];                
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
                  
                  
        String linha = "";
        
        while (true) {
                        
            
        }
        
    }
    
}
