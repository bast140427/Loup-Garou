package Modele;

public class Joueur {
    private boolean enVie;
    private boolean actif;
    private int nbVoteContre;
    private Role role;

    //TODO : un Joueur doit être construit avec un rôle
    public Joueur(Role role) {
        this.enVie = true;
        this.actif = true;
        this.nbVoteContre = 0;
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

    public void voter(Joueur j) {
        j.addVoteContre();
    }

    public void dormir() {
        this.setActif(false);
    }

    public void seReveiller() {
        this.setActif(true);
    }

    //TODO : méthode pour parler dans un futur chat

}
