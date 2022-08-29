/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author chris
 */
public class ejer5 {
    
    static final int max=100;
    static final int min=0;
    static final int n=20;

    public static void main(String[] args) {
        int vect[] = new int[n];
        llenar(vect);
        mostrar(vect);
    }

    private static void mostrar(int[] vect) {
        System.out.println("");
        for (int i = 0; i < vect.length; i++) {
            System.out.print("\t" + vect[i]);
        }
    }

    private static void llenar(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = aleatorio();
        }
    }

    private static int aleatorio() {
        return (int) (Math.random() * ((max + 1) - min)) + min;
    }
}
