package Modele;

import Enumeration.CampEnum;

public class Chasseur extends Role{
    public Chasseur() {
        super(CampEnum.VILLAGEOIS);
    }

    public void tirer(Joueur j) {
        if(!super.joueur.isEnVie()) {
            if(!j.isEnVie()) {
                System.out.println("Impossible de tirer sur un joueur déjà éliminé");
            }else{
                j.setEnVie(false);
            }
        }else{
            System.out.println("Impossible de tirer, le joueur n'est pas encore éliminé");
        }
    }


}
