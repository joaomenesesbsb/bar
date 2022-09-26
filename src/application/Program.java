package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo: ");
		char gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		System.out.println();

		Bill bill = new Bill(gender, beer, barbecue, softDrink);

		System.out.println("RELATÓRIO:");
		System.out.println("Consumo = R$ " + bill.feeding());

		if (bill.couver() > 0) {
			System.out.println("Couvert = R$ " + bill.couver());
		} else {
			System.out.println("Isento de Couvert");
		}
		System.out.println("Ingresso = R$ " + bill.ticket());
		System.out.println();
		System.out.println("Valor a pagar = " + bill.total());

		sc.close();

	}

}
