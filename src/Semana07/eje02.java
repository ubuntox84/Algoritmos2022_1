/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

/**
 *
 * @author chris
 */
abstract class animal{
    //atributos
    //metodos
    //metodos abstractos
    abstract void comer();
}
class perro extends animal{
    void comer(){
        System.out.println("Ricokan");
    }
}
class gato extends animal{
    void comer(){
        System.out.println("Pescado");
    }
}
public class eje02 {
    
}
