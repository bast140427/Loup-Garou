package Modele;

import java.util.Map;

public class Joueur {
    private boolean enVie;
    private boolean actif;
    private Joueur amoureux;
    private int nbVoteContre;
    private Role role;

    private String pseudo;

    //TODO : un Joueur doit être construit avec un rôle
    public Joueur(String pseudo, Role role) {
        this.enVie = true;
        this.actif = true;
        this.nbVoteContre = 0;
        this.pseudo = pseudo;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isEnVie() {
        return enVie;
    }

    public void setEnVie(boolean enVie) {
        this.enVie = enVie;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public int getNbVoteContre() {
        return nbVoteContre;
    }

    public void addVoteContre() {
        nbVoteContre++;
    }

    public Joueur getAmoureux() {
        return amoureux;
    }

    public void setAmoureux(Joueur amoureux) {
        this.amoureux = amoureux;
    }

    public void setNbVoteContre(int nbVoteContre) {
        this.nbVoteContre = nbVoteContre;
    }

    public void voter(Joueur j) {
        j.addVoteContre();
    }

    public void dormir() {
        this.setActif(false);
    }

    public void seReveiller() {
        this.setActif(true);
    }

    public void resetVote() {
        this.nbVoteContre = 0;
    }

    //TODO : méthode pour parler dans un futur chat

}
