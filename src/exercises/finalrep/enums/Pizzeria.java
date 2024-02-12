package exercises.finalrep.enums;

import java.util.Scanner;

public class Pizzeria {
    static Scanner sc=  new Scanner(System.in);
    public static void main(String[] args) {
        Pizza pizza = getPizza();
        System.out.println("Wybrana pizza to"+ pizza);

    }
    static Pizza getPizza(){
        System.out.println("Wybierz pizze: ");
        for (Pizza value : Pizza.values()) {
            System.out.println(value);
        }
        String pizza = sc.nextLine();
        Pizza chosenpizza = switch (pizza){
            case "MARGHERITA" -> Pizza.valueOf("MARGHERITA");
            case "CAPRICIOSA" -> Pizza.valueOf("CAPRICIOSA");
            case "PROSCIUTTO" -> Pizza.valueOf("PROSCIUTTO");
            default -> throw new IllegalArgumentException("wybarno niepoprawna opcje");
        };
        return chosenpizza;
    }
}
