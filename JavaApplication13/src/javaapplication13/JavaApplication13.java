/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author 326128523
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);   
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        long fatorial = 1;

        if (numero < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();
    }
}
        // TODO code application logic here
    
    

