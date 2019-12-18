/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.Date;

/**
 *
 * @author Micah
 */
public class Teste {
    
    
    public static void main(String[] args) {
        Livro li= new Livro("Antonio", 4, "Java");
        Pessoa pe=new Pessoa("Micaela", 456242322, 78965, "freitas@gamil.com");
        
        Emprestimo emp=new Emprestimo(new Date(), new Date(), li, pe);
           System.out.println(li);
        System.out.println(pe);
           System.out.println(emp);
        
    }
    
}
