/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.acesso;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author vitorlupinetti
 */
public class FuncionarioTextoDAO {
       private final ConcurrentHashMap<String, Usuario> usuarios = new ConcurrentHashMap<>();
    
    public FuncionarioTextoDAO()
    { 
        super(Usuario.class);
        Usuario masterUser = new Usuario();
        masterUser.setLogin("master");
        masterUser.setSenha("master");        
        usuarios.put("master", masterUser);
    }
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        Entidade entidade = usuarios.getOrDefault(codigo, null);
        return entidade;
    }
    
    /* Opção 1 
    */
    @Override
    public ArrayList<Entidade> lista() throws SQLException {
        ArrayList<Entidade> entidades;
        entidades = new ArrayList();
        for (Usuario usuario : usuarios.values())
        {
            entidades.add(usuario);
        }
        return entidades;
    }
}
