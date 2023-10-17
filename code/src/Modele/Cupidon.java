package Modele;

import Enumeration.CampEnum;

public class Cupidon extends Role{
    private boolean fleche;
    public Cupidon() {
        super(CampEnum.VILLAGEOIS);
        this.fleche = true;
    }

    public boolean isFleche() {
        return fleche;
    }

    public void rendreAmoureux(Joueur j1, Joueur j2) {
        if(isFleche()) {
            j1.setAmoureux(j2);
            j2.setAmoureux(j1);
        }else{
            System.out.println("Impossible de rendre amoureux car cette action a déjà été effectuée");
        }
    }
}
