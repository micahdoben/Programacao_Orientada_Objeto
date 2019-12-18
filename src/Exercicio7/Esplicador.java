/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

/**
 *
 * @author Micah
 */
public class Esplicador {
    /*7.1. Declare os seguintes atributos na classe:
Nome de usuário, data de nascimento, email, código de visita
*/
    private String nomeUsuario;
    private int dataNascimento;
    private String email;
    private int codVisita;
    
/*7.2. Faça o encapsulamento dos atributos da classe Explicador
*7.3. Os atributos nome de usuário, data de nascimento, email e código de visita são
*obrigatórios (crie um construtor com esses parâmetros)
*/

    public Esplicador(String nomeUsuario, int dataNascimento, String email, int codVisita) {
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.codVisita = codVisita;
    }
    

}
