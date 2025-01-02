public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int stock;

    public Produit(long id, String nom, String marque, double prix, String description, int stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                '}';
    }
}

