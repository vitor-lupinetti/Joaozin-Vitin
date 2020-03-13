/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.crud;
import business.basis.FabricaRepositorio;
import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
import dao.repositorio.basis.Repositorio;
/**
 *
 * @author vitorlupinetti
 */
public class Crud {
    public void Insere(Entidade E, EntidadesDisponiveis enumEntidade){
        Repositorio repositorio = FabricaRepositorio.Fabrica(); 
        repositorio.insere(E, enumEntidade);
    }
    public Entidade Deleta(Entidade E, EntidadesDisponiveis enumEntidade){
       Repositorio repositorio = FabricaRepositorio.Fabrica(); 
       Entidade retorno = repositorio.deleta(E, enumEntidade);

       return retorno;
    }
    public Entidade Atualiza(Entidade E, EntidadesDisponiveis enumEntidade){
      Repositorio repositorio = FabricaRepositorio.Fabrica(); 
      Entidade retorno = repositorio.atualiza(E, enumEntidade);

      return retorno;
    }
    
}
