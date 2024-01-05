
package com.mycompany.codigonumero2;

public abstract class Animales {
    public String nombre;
    private int edad;
    
    public Animales(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
 
    public void setEdad (int edad){
        this.edad=edad;
    }
    public int getEdad (){
        return edad;
    }
    public abstract void hacerSonido();
    
    
    }
    

