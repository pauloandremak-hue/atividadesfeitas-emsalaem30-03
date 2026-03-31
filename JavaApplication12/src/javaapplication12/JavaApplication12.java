/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author 326128523
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int mult2 = 0;
        int mult3 = 0;
        int mult5 = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                mult2++;
            }
            if (i % 3 == 0) {
                mult3++;
            }
            if (i % 5 == 0) {
                mult5++;
            }
        }

        System.out.println("Múltiplos de 2: " + mult2);
        System.out.println("Múltiplos de 3: " + mult3);
        System.out.println("Múltiplos de 5: " + mult5);
    }
}
        // TODO code application logic here
    
    

