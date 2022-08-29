/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

import java.util.Random;

/**
 *
 * @author chris
 */
public class ejer7 {
    static final int min=1;
    static final int max=10;
    
    public static void main(String[] args) {
        int a[]=new int [10];
        llenar(a);
        mostrar(a);
    }

    private static void llenar(int[] a) {        
        for (int i = 0; i < a.length; i++) {
            a[i]=aletorio();
        }
    }

    private static void mostrar(int [] a) {
        for(Integer x:a){
            System.out.print("\t"+x);
        }
    }

    private static int aletorio() {
        Random rd=new Random();
        int r=rd.nextInt((max-min)+1)+min;
        return r;
    }
    
    
}
