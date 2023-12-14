package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

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

    Bill b = new Bill(gender, beer, barbecue, softDrink);

    System.out.println();
    System.out.println("RELATÓRIO:");
    System.out.printf("Consumo = %.2f%n", b.feeding());
    if(b.cover() == 0.00) {
      System.out.println("Isento de Couvert");
    } else {
      System.out.printf("Couvert = %.2f%n", b.cover());
    }
    System.out.printf("Ingresso = %.2f%n", b.ticket());
    System.out.println();
    System.out.printf("Valor a pagar = R$ %.2f%n", b.total());


    sc.close();

  }
}
