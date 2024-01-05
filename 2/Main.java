
package com.mycompany.codigonumero2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Ingresa el nombre del gato ");
        String nombreGato = scanner.nextLine();
        
        System.out.println("Ingresa la edad en años de " + nombreGato);
        int edadGato = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingresa el color de pelo de " + nombreGato);
        String colorDePeloGato = scanner.nextLine();
        
        Gato miau = new Gato (nombreGato, edadGato, colorDePeloGato);
        System.out.println("Estos son los datos del gato: "+ nombreGato + " edad " + edadGato + " años " + " de color "+colorDePeloGato);
        
        
        System.out.println("Ingrese el nombre del perro:");
        String nombrePerro = scanner.nextLine();
        
        System.out.println("Ingrese la edad en años de " + nombrePerro);
        int edadPerro = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la raza de " + nombrePerro);
        String razaPerro = scanner.nextLine();
        
        Perro guau = new Perro (nombrePerro, edadPerro, razaPerro);
        System.out.println("Estos son los datos del perro: "+ nombrePerro + " su raza es " + razaPerro + " y su edad es " + edadPerro + " años ");
        
        
        miau.treparArbol();
        miau.cazarRaton();
        miau.hacerSonido();
        
        guau.correr();
        guau.jugar();
        guau.hacerSonido();
 
    }
    
}
