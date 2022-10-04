/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07;

/**
 *
 * @author chris
 */
class Persona{
    private String name;
    private String lastname;
    public Persona(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;    }
    @Override
    public String toString() {
        return "persona{" + "name=" + name + ", lastname=" + lastname + '}';
    }    
}
class Alumno extends Persona{
    private String code;
    public Alumno(String code, String name, String lastname) {
        super(name, lastname);
        this.code = code;
    }    
}
class Profesor extends Persona{
    private String code;

    public Profesor(String code, String name, String lastname) {
        super(name, lastname);
        this.code = code;
    }
    
}
public class ejer01 {
    public static void main(String[] args) {
        Alumno a1=new Alumno("E15", "Norberto", "Sumaran");
        Profesor p1=new Profesor("F20", "Christian", "Garcia");
        System.out.println(a1.toString());
        System.out.println(p1.toString());
    }
}
