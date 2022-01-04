package es.studium.Ejercicio3;

import java.util.Random;

public class Ejercicio3 extends Thread {
	
	
	public Ejercicio3(String str) {
		super(str);
	}

	@Override //Porque lo estoy sobreescribiendo
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Este es el hilo  " + getName());
		}
		
		System.out.println("Termina thread " + getName());
	}

	public static void main(String[] args) {
		String[] planetas = {"Mercurio", "Venus", "La tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno", "Plutón"};
		//Thread hilo1 = new Thread(); tbn se puede poner:
		Random rnd = new Random();
		new Ejercicio3(planetas[rnd.nextInt(9)]).start();
		new Ejercicio3(planetas[rnd.nextInt(9)]).start();
		new Ejercicio3(planetas[rnd.nextInt(9)]).start();
	}
}
