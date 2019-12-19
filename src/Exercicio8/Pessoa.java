/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

/**
 *
 * @author Micah
 */
public class Pessoa {
  private String nome;
   private int telefone;
   private String email;
   private int dataAniversario;

    public Pessoa(String nome, int telefone, String email, int dataAniversario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(int dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataAniversario=" + dataAniversario + '}';
    }
   
}
