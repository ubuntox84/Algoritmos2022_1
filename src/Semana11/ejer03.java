/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana11;

/**
 *
 * @author chris
 */
class metodo{
    int exponente(int x, int y){
        if(y==0){
            return 1;
        }else{
            return x*exponente(x, y-1);
        }
    }
}
public class ejer03 {
    public static void main(String[] args) {
        metodo m=new metodo();
        System.out.println(m.exponente(5, 2));
        //2*2*2*2*2
    }
}
