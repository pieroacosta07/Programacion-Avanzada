package ejercicio2;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

        Autos a1 = new Autos("Auto", "Toyota", "Corolla", "KOI", 15000);
		
		System.out.println("Ingresa el tipo de tu vehículo: ");
		a1.setTipo(lector.nextLine());
		
		System.out.println("Ingresa la marca: ");
		a1.setMarca(lector.nextLine());
		
		System.out.println("Ingresa el modelo: ");
		a1.setModelo(lector.nextLine());
		
		System.out.println("Ingresa la matrícula: ");
		a1.setMatricula(lector.nextLine());
		
		System.out.println("Ingresa el precio: ");
		a1.setPrecio(lector.nextInt());
		
		System.out.println("Tipo de vehículo: " + a1.getTipo() + ", Marca: " + a1.getMarca() + ", Modelo: " + a1.getModelo() + ", Matrícula: " + a1.getMatricula() + ", Precio: " + a1.getPrecio());
		
	}

}
