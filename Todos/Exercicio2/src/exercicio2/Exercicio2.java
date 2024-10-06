/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Alexsandro Cuenca
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int numero;
     
    System.out.println("Digite um número: ");
    numero = teclado.nextInt();
   
    for (int i = numero-1; i >= 0 ; i--) {
            System.out.println(i);
            
    }
     
     
    
        

// TODO code application logic here
    }

}
