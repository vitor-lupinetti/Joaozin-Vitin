/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.repositorio.basis;
import comuns.crud.basis.Entidade;
import comuns.enums.EntidadesDisponiveis;
/**
 *
 * @author vitorlupinetti
 */
public abstract class Repositorio {
    public abstract Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade);
    public abstract Entidade insere(Entidade entidade, EntidadesDisponiveis tipoEntidade);
    public abstract Entidade atualiza(Entidade entidade, EntidadesDisponiveis tipoEntidade);
    public abstract Entidade deleta(Entidade entidade, EntidadesDisponiveis tipoEntidade);
}
