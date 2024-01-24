package exercises.enums;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = Pizza.values();
        Pizza pizza;
        System.out.println("Wybuierz jedną z pizz: ");
        for (Pizza piza : pizzas) {
            System.out.println(
                    piza.toString()+" wpisz: "+piza.getDescribtion());
        }
        String chosenPizza = scanner.nextLine();
        pizza = Pizza.fromDescribtion(chosenPizza);
        System.out.println("Twoje zamówienie to: "+pizza.toString());
    }
}
