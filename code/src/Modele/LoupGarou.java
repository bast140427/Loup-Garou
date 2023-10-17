package Modele;

import Enumeration.CampEnum;

public class LoupGarou extends Role{
    public LoupGarou() {
        super(CampEnum.LOUP_GAROUS);
    }

    public void manger(Joueur j) {
        if(!j.isEnVie()) {
            System.out.println("Le joueur n'est plus en vie");
        }else{
            j.addVoteContre();
        }

    }

}
