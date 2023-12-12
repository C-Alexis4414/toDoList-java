import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // Créez un objet Scanner pour lire l'entrée de l'utilisateur depuis la console
        Scanner scanner = new Scanner(System.in);
        // Demandez à l'utilisateur de saisir quelque chose
        System.out.print("Saisissez quelque chose : ");
        // Utilisez la méthode nextLine() pour lire une ligne de texte entrée par l'utilisateur
        String userInput = scanner.nextLine();
        // Affichez ce que l'utilisateur a saisi
        list.add(userInput);
        do {
            System.out.println("Vous avez saisi : " + userInput);
            System.out.print("Saisissez quelque chose : ");
            userInput = scanner.nextLine();
            list.add(userInput);
        } while (!userInput.equals("exit"));
        if (userInput.equals("exit")) {
            list.remove(list.size() - 1); // Supprime le dernier élément de la liste
            System.out.println("Voici la liste de vos tâches : ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        // N'oubliez pas de fermer le scanner lorsque vous avez terminé
        scanner.close();
    }
}