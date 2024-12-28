import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        ArrayList<Army> armies = new ArrayList<Army>();
        System.out.println("Bienvenue dans le système de création d'armée.");
        armies.add(createArmy(armies));
        boolean createMoreArmies = true;
        while (createMoreArmies) {
            System.out.println("Voulez vous créer une autre armée(O/N)?");
            String answer = scanner.next();
            if (answer.equals("O") || answer.equals("o") || answer.equals("Oui") || answer.equals("oui")) {
                armies.add(createArmy(armies));
            }
            else {
                createMoreArmies = false;
            }
        }
        for (int i = 0; i < armies.size(); i++) {
            System.out.println(armies.get(i).getName());
        }
        System.out.println("Quel armée voulez vous remplir (de 1 à " + armies.size() + ")?");
        int armyToFill = scanner.nextInt();
        if (armyToFill > armies.size()) {
            armyToFill = 0;
        }
        else {
            armyToFill = armyToFill-1;
        }
    }

    public static Army createArmy(ArrayList<Army> currentArmies) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Créez une armée, donnez lui un nom:");
        String nomArmee = scanner.next();

        System.out.println("Donnez une faction à votre armée:");
        String factionArmee = scanner.next();

        System.out.println("Donnez une valeur d'armée maximale à votre armée:");
        int pointsMaxArmee = scanner.nextInt();

        System.out.println("Voulez vous créer l'armée " + nomArmee + " de la faction " + factionArmee + " avec " + pointsMaxArmee + " points d'armée(O/N)?");
        String validation = scanner.next();
        if (validation.equals("O") || validation.equals("o") || validation.equals("Oui") || validation.equals("oui")) {
            boolean notInArmies = true;
            for (int i = 0; i < currentArmies.size(); i++) {
                if (currentArmies.get(i).getName().equals(nomArmee)) {
                    notInArmies = false;
                }
            }
            if (notInArmies) {
                return new Army(nomArmee,factionArmee,pointsMaxArmee);
            }
            else {
                System.out.println("Le nom de l'armée existe déjà, changez de nom.");
                return createArmy(currentArmies);
            }
        }
        else {
            return createArmy(currentArmies);
        }
    }
}