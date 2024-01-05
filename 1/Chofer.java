
package com.mycompany.deber2;

import java.util.Scanner;

public class Chofer extends Persona {
    public String placa;
    public String codigo;   
public Chofer (){
    super();
    this.placa=ingresarPlaca();
    this.codigo=ingresarCodigo();
}    
public String ingresarPlaca(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingrese la placa del taxi");
    return scanner.nextLine();
}
public String ingresarCodigo(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingrese el codigo del taxi");
    return scanner.nextLine();
}
public void aceptarCarrera(){
    System.out.println("Aceptando la carrera");
}
public void cancelarCarrera(){
    System.out.println("Cancelando la carrera");
}
    @Override
    public void mostrarInformacion() {      
    }   
}
