/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.acesso;
import comuns.vos.Funcionario;
import comuns.enums.EntidadesDisponiveis;
/**
 *
 * @author vitorlupinetti
 */
public class Acesso {
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaFuncionario(Funcionario func) {
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        Funcionario funcionario = (Funcionario)repositorio.localiza(func.getLogin(), EntidadesDisponiveis.FUNCIONARIO);
        if (funcionario != null)
        {
            retorno = validaSenha(funcionario.getSenha(), func.getSenha());
        }
        return retorno;
    }
}
