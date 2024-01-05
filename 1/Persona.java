
package com.mycompany.deber2;

import java.util.Scanner;


public abstract class Persona {
    public String nombre;
    public int edad;
    private int cedula;
    
    public Persona (){
        this.nombre=ingresarNombre();
        this.edad= ingresarEdad();
        this.cedula = ingresarCedula();
    }
    
    public String ingresarNombre (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese su nombre:");
        return scanner.nextLine();
    }
        
    public int ingresarEdad(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese su edad:");
        return scanner.nextInt();
    }
    
    
    private int ingresarCedula(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese su cedula:");
        return scanner.nextInt();    
    }
    public int getCedula(){
        return cedula;
    }
    
    public abstract void mostrarInformacion(); 
        
}
