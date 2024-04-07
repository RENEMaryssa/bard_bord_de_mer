package sio.d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static List<Cocktail> listeCocktail = new ArrayList<>();

    public static void main(String[] args) {
        // Ajout des cocktails, ingrédients, proportions, et types de verre depuis Cocktails-sans-Alcool.fr
        // à remplir selon les besoins


        initialiserDonnees();

        // Appels aux différentes méthodes pour tester
        listerCocktails();
        listerCocktailsPrixInferieurA8();
        listerCocktailsPrixSuperieurOuEgalA8();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le type de verre : ");
        String typeVerre = scanner.nextLine();
        listerCocktailsParTypeVerre(typeVerre);

        System.out.println("Entrez le nom de l'ingrédient : ");
        String ingredient = scanner.nextLine();
        listerCocktailsParIngredient(ingredient);
    }

    // Ajout de plusieurs cocktails (cocktails, ingrédients, proportions, typeverres) depuis Cocktails-sans-Alcool.fr
    private static void initialiserDonnees() {
        // À remplir avec les données des cocktails, ingrédients, proportions, et types de verre

    }

    // Méthode pour lister tous les cocktails
    private static void listerCocktails() {
        for (Cocktail cocktail : listeCocktail) {
            System.out.println(cocktail.getNom());
        }
    }

    // Méthode pour lister les cocktails dont le prix est inférieur à 8€
    private static void listerCocktailsPrixInferieurA8() {
        for (Cocktail cocktail : listeCocktail) {
            if (cocktail.getPrix() < 8) {
                System.out.println(cocktail.getNom());
            }
        }
    }

    // Méthode pour lister les cocktails dont le prix est supérieur ou égal à 8€
    private static void listerCocktailsPrixSuperieurOuEgalA8() {
        for (Cocktail cocktail : listeCocktail) {
            if (cocktail.getPrix() >= 8) {
                System.out.println(cocktail.getNom());
            }
        }
    }

    // Méthode pour lister les cocktails servis dans un type de verre saisi au clavier
    private static void listerCocktailsParTypeVerre(String typeVerre) {
        for (Cocktail cocktail : listeCocktail) {
            if (cocktail.getTypeVerre().getNom().equalsIgnoreCase(typeVerre)) {
                System.out.println(cocktail.getNom());
            }
        }
    }

    // Méthode pour lister les cocktails contenant un ingrédient dont le nom est saisi au clavier
    private static void listerCocktailsParIngredient(String ingredient) {
        for (Cocktail cocktail : listeCocktail) {
            for (Proportion proportion : cocktail.getProportion()) {
                if (proportion.getIngredient().getNom().equalsIgnoreCase(ingredient)) {
                    System.out.println(cocktail.getNom());
                    break; // Sortir de la boucle interne une fois qu'on a trouvé un cocktail avec l'ingrédient
                }
            }
        }
    }
}
