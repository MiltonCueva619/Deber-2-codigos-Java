
package com.mycompany.persona;

abstract public class Persona {
    public String nombre;
    public int edad;
    private int ci;
    
    public Persona (String nombre, int edad, int ci){
        this.nombre = nombre;
        this.edad = edad;   
        this.ci=ci;
    }
    
    public void setCi(int ci){
        this.ci=ci;
    
    }
    public int getCi(){
        return ci;
    }
    
    public void comer (){
        System.out.println("Esta comiendo");
    }
        
    public void dormir (){
        System.out.println("Esta durmiendo");
    }
    

}



