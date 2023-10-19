package Modele;

public class GameEngine {
    private Jeu jeu;

    public GameEngine(Jeu jeu) {
        this.jeu = jeu;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    /** Gestion de la partie **/
}
