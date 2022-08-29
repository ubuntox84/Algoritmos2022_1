/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author chris
 */
class Perro{
    private String name;
    private String raza;
    private char sexo;
    
    //constructor
    public Perro(String n, String r, char s){
        this.name=n;
        this.raza=r;
        this.sexo=s;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //get - set por variable
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
    }
    
    public String informacion(){
        return "\tNombre: "+this.name+
                "\tRaza: "+this.raza+
                "\tSexo: "+this.sexo;
    }
    
}
public class ejer1 {
    public static void main(String[] args) {
        Perro p=new Perro("Dukequesa","Chusco",'H');
        System.out.println("Original\t"+p.informacion());
        p.setName("Luna");
        p.setRaza("Boxer");
        System.out.println("Modificado\t"+p.informacion());
    }
}
