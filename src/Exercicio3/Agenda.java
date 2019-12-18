
package Exercicio3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Micah
 */
public class Agenda {
    public static void main(String[] args) {
        Vector guardar= new  Vector();
        Contacto sv=new Contacto();
        Scanner conta = new Scanner(System.in);
//        sv.setNome("Micaela");
//        sv.setNumero(545454);
//        sv.setEmail("ncgdhg");
//        guardar.add(sv);
//        System.out.println(sv);


for(int a = 0; a<2; a++){
    sv.setNome(conta.next());
    sv.setNumero(conta.nextInt());
    sv.setEmail(conta.next());

        guardar.add(sv);
}
    
    System.out.println(guardar);
 
}
}
