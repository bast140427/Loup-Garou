package Modele;

import Enumeration.CampEnum;

public class Voyante extends Role{
    public Voyante() {
        super(CampEnum.VILLAGEOIS);
    }

    public Role espionner(Joueur j) {
        return j.getRole();
    }
}
