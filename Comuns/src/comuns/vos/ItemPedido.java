/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comuns.vos;
import comuns.crud.basis.Entidade;
/**
 *
 * @author vitorlupinetti
 */
public class ItemPedido extends Entidade {
    
    private int produtoId;
    private int pedidoId;

    /**
     * @return the produtoId
     */
    public int getProdutoId() {
        return produtoId;
    }

    /**
     * @param produtoId the produtoId to set
     */
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    /**
     * @return the pedidoId
     */
    public int getPedidoId() {
        return pedidoId;
    }

    /**
     * @param pedidoId the pedidoId to set
     */
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
}
