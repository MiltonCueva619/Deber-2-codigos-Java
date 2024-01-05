
package com.mycompany.persona;


public class Pinguino extends Zoo{
    public Pinguino (String nombre, int edad, int registro){
        super(nombre, edad, registro);
    }
    public void nadar(){
    System.out.println(nombre + " esta nadando ");
    }
    public void pescar(){
    System.out.println(nombre + " esta pescando ");
    }

}
