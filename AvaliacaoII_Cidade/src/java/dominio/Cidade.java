/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.io.Serializable;

/**
 *
 * @author rafa
 */
public class Cidade implements Serializable{
    
    private String Estado;
    
    private String Nome;
    
    private int Populacao;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(int Populacao) {
        this.Populacao = Populacao;
    }
    
    public boolean persiste() {
        return false; 
    }
    
}
