package com.generation;

import java.util.Scanner;


/*
 * Programa para piedra, papel o tijeras entre dos jugadores
 * El programa pide que el primer jugador ingrese una de las opciones : piedra, papel o tijeras
 * y luego guarda su opción en la variable j1 de tipo String
 * Luego el programa repite la misma acción pero ahora para el segundo jugador 
 * y luego guarda su opción en la variable j2 de tipo String
 * En caso de que alguna de las opciones no sean válidas, no va a haber un ganador
 * En otro caso se va a elegir a un ganador con base en las opciones válidas
 * 
 */
public class Codigo4 {
	
	public static void main(String[] args) {//Se agregó el método main
		boolean errorFlag = false;  //Agregamos una variable boolean en caso de error
		int g = 2; //Variable para determinar al ganador
		
		Scanner s = new Scanner(System.in);//Se agregó System.in para que lea los datos desde la consola
	    //Se cambió print  a  println para mayor legibilidad a la hora de ejecucion
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se cambió el 1 por el 2 en el string
	    //Scanner s2 = new Scanner(); //No es necesarion abrir un nuevo Scanner porque ya había uno abierto
	    String j2 = s.nextLine();
	    
	    if (j1.equalsIgnoreCase(j2)) { //Se eliminó un ), //se agregó el método equals para comparar Strings
	      
	      if( !j1.equalsIgnoreCase("piedra") && !j1.equalsIgnoreCase("papel") && !j1.equalsIgnoreCase("tijera") ) {
	    	  errorFlag = true; //Activamos la variable error, porque encontramos un error
	      }else {
	    	  System.out.println("Empate");
	      }
	      
	    } else { 
	         
	      switch(j1) {
	        case "piedra":
	          if (j2.equalsIgnoreCase("tijeras")) { //se agregó el método equals para comparar Strings
	            g = 1;
	          }

	        case "papel":
	          if (j2.equalsIgnoreCase("piedra")) {  //se agregó el método equals para comparar Strings
	            g = 1;
	          }//Se agregó un } para cerrar el if
	          
	        case "tijera":
	          if (j2.equalsIgnoreCase("papel")) {//se agregó el método equals para comparar Strings
	            g = 1;
	          }
	          break;
	        default://Si no se ingresó alguna opción valida
	        	//Error
	        	errorFlag = true; //Activamos la variable error, porque encontramos un error
	      }  
	      
	    }
	    
	    if( !errorFlag ) { //Si hubo ganador debido a que las opciones eran válidas
	    	  System.out.println("Gana el jugador " + g);
	      }else { //Si los datos ingresados no son válidos
	    	  System.out.println("Datos no válidos, ingrese alguna de las opciones: piedra ,  papel , tijera");
	      }
	      
	      System.out.println("Fin del programa");	
	}
	
  
}
