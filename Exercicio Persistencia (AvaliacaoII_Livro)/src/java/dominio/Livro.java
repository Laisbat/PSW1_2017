/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rafa
 */
public class Livro implements Serializable{
    
    private String Nome;
    
    private String Autor;
    
    private int Ano_Lancamento;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAno_Lancamento() {
        return Ano_Lancamento;
    }

    public void setAno_Lancamento(int Ano_Lancamento) {
        this.Ano_Lancamento = Ano_Lancamento;
    }
    
    public boolean persiste() {
         try{
                
                
                //Carrega o driver na memória
                Class.forName("org.apache.derby.jdbc.ClientDriver");

                // Conecta ao banco
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app", "app");

                // Cria a transação
                java.sql.Statement transacao = con.createStatement();            


                String query = "INSERT INTO LIVROS VALUES ('@@NOME@@', '@@AUTOR@@', @@ANO@@)";
                
                query = query.replace("@@NOME@@", Nome);
                query = query.replace("@@AUTOR@@", Autor);
                query = query.replace("@@ANO@@", Integer.toString(Ano_Lancamento));
                
                //executa um update
                transacao.executeUpdate(query);

                //*** Finaliza transação e conexão
                transacao.close();
                
                con.close();
                
                return true;
            }
            catch (Exception ex){
                ex.printStackTrace();
                return false;
            }
    }
    
}
