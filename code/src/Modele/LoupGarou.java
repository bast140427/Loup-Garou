package Modele;

import Enumeration.CampEnum;

public class LoupGarou extends Role{
    public LoupGarou() {
        super(CampEnum.LOUP_GAROUS);
    }

    public void manger(Joueur j) {
        j.addVoteContre();
    }

}
