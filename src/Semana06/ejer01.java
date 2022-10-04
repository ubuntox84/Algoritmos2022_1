/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

/**
 *
 * @author chris
 */
public class ejer01 {

    public static void main(String[] args) {
        int acu = 0;
        
//        for (int i = 0; i < 100000000; i++) {
//            acu+=i;
//        } 
        long vector[]=new long[100];
        for (int i = 0; i < 100; i++) {
            long inicio = System.currentTimeMillis();
            int j=0;
            while (j < 100000000) {            
                acu+=j;
                j++;
            }
            long fin = System.currentTimeMillis();
            vector[i]=(fin - inicio);
        }
        int p=0;
        long men=1000,may=0;
        long acu2=0;
        for(Long x:vector){
            if(p==10){
                System.out.print("\n");
                p=0;
            }
            System.out.print("\t"+x);
            if(x<men){
                men=x;
            }else if(x>may){
                may=x;
            }
            acu2+=x;
            p++;
        }
        
        System.out.println("\nMeñor: "+men);
        System.out.println("Mayor: "+may);
        System.out.println("Promedio: "+(acu2/100));
    }
}
