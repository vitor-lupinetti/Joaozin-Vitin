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
    
    
    private String clienteNome;
    private String vendedor;
    private String produto;

   
    /**
     * @return the clienteId
     */
    public String getClienteNome() {
        return clienteNome;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    /**
     * @return the vendedorId
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedorId the vendedorId to set
     */
    public void setVendedor(String vendedorId) {
        this.vendedor = vendedorId;
    }

    /**
     * @return the produtoId
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produtoId the produtoId to set
     */
    public void setProduto(String produtoId) {
        this.produto = produtoId;
    }
}
