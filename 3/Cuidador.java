
package com.mycompany.persona;

public class Cuidador extends Persona {
    public String id;
    
    public Cuidador (String nombre, int edad, int ci, String id){
        super(nombre, edad, ci);
        this.id=id;
    }
    public void AlimentarAnimales(){
        System.out.println(nombre+ " con " +id+  "esta alimentando a los animales ");
    }
    
}
