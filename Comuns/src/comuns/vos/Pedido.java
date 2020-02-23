/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comuns.vos;
import java.util.Calendar;
import comuns.crud.basis.Entidade;
/**
 *
 * @author vitorlupinetti
 */
public class Pedido extends Entidade {
    
    private Calendar dataPedido;
    private int clienteId;
    private int vendedorId;
    private int produtoId;

    /**
     * @return the dataPedido
     */
    public Calendar getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return the clienteId
     */
    public int getClienteId() {
        return clienteId;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * @return the vendedorId
     */
    public int getVendedorId() {
        return vendedorId;
    }

    /**
     * @param vendedorId the vendedorId to set
     */
    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

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
}
