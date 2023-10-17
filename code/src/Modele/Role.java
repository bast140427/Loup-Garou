package Modele;

import Enumeration.CampEnum;
import Enumeration.RoleEnum;

public class Role {
    protected CampEnum camp;
    protected RoleEnum roleEnum;
    protected Joueur joueur;

    public Role(CampEnum camp) {
        this.camp = camp;
    }

    public CampEnum getCamp() {
        return camp;
    }

    public void setCamp(CampEnum camp) {
        this.camp = camp;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}
