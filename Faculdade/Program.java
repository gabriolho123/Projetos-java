package Electronic;

import java.util.Scanner;

import Entidades.Computador;

public class Program {

	public static void main(String[] args) {
		
		Computador pc = new Computador("SN-12345", "Notebook Pro", 16);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("---- Teste de funcionalidade ----");

	
		System.out.println("Estado inicial (Desligado): " + pc.isligar());

		
		pc.ligar(); 

		
		System.out.println("Status após primeira ação: " + pc.isligar());

		
		pc.ligar(); 

		
		pc.desligar(); 

	
		System.out.println("Estado final: (ligado) " + pc.isligar());
		
		pc.desligar();
		
		System.out.println("-------- Config do pc --------" );
		System.out.println( pc.toString());

		
		sc.close();

	}

}
