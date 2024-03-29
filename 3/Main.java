
package com.mycompany.persona;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Ingrese el nombre del visitante: ");
            String nombreVisitante = scanner.nextLine();
            System.out.print("Ingrese la deda del visitante: ");
            int edadVisitante = Integer.parseInt(scanner.nextLine());
            System.out.print("ingrese la cedula del visitante: ");
            int ciVisitante = Integer.parseInt(scanner.nextLine());
            System.out.print("ingrese el carnet del visitante: ");
            int carnetVisitante = Integer.parseInt(scanner.nextLine());
            Visitante visitante= new Visitante (nombreVisitante, edadVisitante, ciVisitante, carnetVisitante);
            
            System.out.print("Ingrese el nombre del cuidador: ");
            String nombreCuidador = scanner.nextLine();
            System.out.print("Ingrese la edad del cuidador: ");
            int edadCuidador = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese la cedula del cuidador: ");
            int ciCuidador = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese la identificacion del cuidador: ");
            String idCuidador = scanner.nextLine();
            Cuidador cuidador = new Cuidador (nombreCuidador, edadCuidador, ciCuidador, idCuidador);
            
            System.out.print("Ingrese el nombre del leon: ");
            String nombreLeon = scanner.nextLine();
            System.out.print("Ingrese la edad del leon: ");
            int edadLeon = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el registro del leon: ");
            int registroLeon = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese la vacuna del leon: ");
            String vacunaLeon = scanner.nextLine();
            Leon leon = new Leon (nombreLeon, edadLeon, registroLeon, vacunaLeon);
            
            System.out.print("Ingrese el nombre del pinguino: ");
            String nombrePinguino = scanner.nextLine();
            System.out.print("Ingrese la edad del pinguino: ");
            int edadPinguino = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el registro del pinguino: ");
            int registroPinguino = Integer.parseInt(scanner.nextLine());        
            Pinguino pinguino = new Pinguino (nombrePinguino, edadPinguino, registroPinguino);
            
            visitante.comer();
            cuidador.AlimentarAnimales();
            leon.cazar();
            pinguino.nadar();
            pinguino.pescar();
            
        } catch (NumberFormatException e) {
            System.out.println("Error: ingrse un numero valido para la edad");
    }      
  }
}
