import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter le programme");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.println("Liste des produits:");
                    for (Produit p : metier.getAll()) {
                        System.out.println(p);
                    }
       }
                case 2 -> {
                    System.out.print("Entrez l'id du produit : ");
                    long id = scanner.nextLong();
                    Produit produit = metier.findById(id);
                    if (produit != null) {
                        System.out.println("Produit trouvé : " + produit);
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                }
                case 3 -> {
                    System.out.print("Entrez l'id : ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Consommer le retour à la ligne
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Consommer le retour à la ligne
                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le stock : ");
                    int stock = scanner.nextInt();
                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, stock);
                    metier.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès.");
                }
                case 4 -> {
                    System.out.print("Entrez l'id du produit à supprimer : ");
                    long id = scanner.nextLong();
                    metier.delete(id);
                    System.out.println("Produit supprimé avec succès.");
                }
                case 5 -> {
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}
