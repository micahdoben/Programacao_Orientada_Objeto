
package Exercicio4;

import java.util.Date;

/**
 *
 * @author Micah
 */
public class Emprestimo {
  private Date dataEmpresta;
  private Date dataEntrega;
  private Livro livro;
  private Pessoa pessoa;

    public Emprestimo(Date dataEmpresta, Date dataEntrega, Livro livro, Pessoa pessoa) {
        this.dataEmpresta = dataEmpresta;
        this.dataEntrega = dataEntrega;
        this.livro = livro;
        this.pessoa = pessoa;
    }
  

    
    public Date getDataEmpresta() {
        return dataEmpresta;
    }

    public void setDataEmpresta(Date dataEmpresta) {
        this.dataEmpresta = dataEmpresta;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "dataEmpresta=" + dataEmpresta + ", dataEntrega=" + dataEntrega + ", livro=" + livro + ", pessoa=" + pessoa + '}';
    }
  
  
}
