/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comuns.crud.basis;
import comuns.enums.EntidadesDisponiveis;
import comuns.vos.Cliente;
import comuns.vos.Vendedor;
import comuns.vos.Gerente;
import comuns.vos.ItemPedido;
import comuns.vos.Pedido;
import comuns.vos.Produto;
/**
 *
 * @author vitorlupinetti
 */
public class FabricaEntidades {
    public static Entidade FabricaEntidade(EntidadesDisponiveis entidade){
        
        Entidade entidadeRetorno;
        
        switch (entidade){
            case VENDEDOR:
                entidadeRetorno = new Vendedor();
                break;
            case GERENTE:
                entidadeRetorno = new Gerente();
                break;
            case PRODUTO:
                entidadeRetorno = new Produto();
                break;
            case PEDIDO:
                entidadeRetorno = new Pedido();
                break;
            case ITEM_PEDIDO:
                entidadeRetorno = new ItemPedido();
                break;
            case CLIENTE:
                entidadeRetorno = new Cliente();
                break;
            default:
                entidadeRetorno = new Entidade();
                break;              
        }
        return entidadeRetorno;
    }
}
