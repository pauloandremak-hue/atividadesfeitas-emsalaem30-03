/*  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template  */ 
package javaapplication10;  
import java.util.Scanner; 
public class JavaApplication10 {     
    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);          
        int n;               
        System.out.println("Digite um numero");     
        n=entrada.nextInt();     for(int i = 1; i <= 10; i++){         
            System.out.println(n+ "x" + i +"="+(n*i));     
        }              
    }            
}