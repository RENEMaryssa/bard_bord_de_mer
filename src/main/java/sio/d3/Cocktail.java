package sio.d3;

public class Cocktail {
    private int id;
    private String nom;
    private int prix;
    private String service;
    private TypeVerre typeVerre;
    private String couleur;

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    // Getters et setters pour tous les attributs
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public TypeVerre getTypeVerre() {
        return typeVerre;
    }

    public void setTypeVerre(TypeVerre typeVerre) {
        this.typeVerre = typeVerre;
    }

    public Cocktail() {
    }

    public Proportion[] getProportion() {
        return new Proportion[0];
    }
}
