package fr.exorentree;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande le nombre de pièces de chaque type
        System.out.println("Combien de pièces de 1 cent avez-vous ?");
        int cent1 = scanner.nextInt();

        System.out.println("Combien de pièces de 5 cents avez-vous ?");
        int cent5 = scanner.nextInt();

        System.out.println("Combien de pièces de 10 cents avez-vous ?");
        int cent10 = scanner.nextInt();

        System.out.println("Combien de pièces de 20 cents avez-vous ?");
        int cent20 = scanner.nextInt();

        System.out.println("Combien de pièces de 50 cents avez-vous ?");
        int cent50 = scanner.nextInt();

        // Calcule le total en cents
        int totalCents = cent1 + cent5 * 5 + cent10 * 10 + cent20 * 20 + cent50 * 50;

        // Vérifie le total et affiche le message approprié
        if (totalCents < 100) {
            int diff = 100 - totalCents;
            System.out.println("Il vous manque " + diff + " cents pour prendre un café.");
        } else if (totalCents == 100) {
            System.out.println("Vous avez exactement de quoi vous payer le café !");
        } else {
            int change = totalCents - 100;
            System.out.println("Il vous restera " + change + " cents après avoir pris votre café !");
        }


    }
    
}
