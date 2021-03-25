package hello;

import java.util.Scanner;
import java.util.Random;

public class klasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int random = rand.nextInt(10)+1;
		
		System.out.println("Zgadnij liczbe od 1 do 10.");
		
		
		while(true) {
		
		int in = scanner.nextInt();
		if(in == random) {
			System.out.println("Brawo, zgadles :)");
			break;
		}else {
			
			System.out.println("Sprobuj jeszcze raz.");
			
		}
		
		}
	}

}
