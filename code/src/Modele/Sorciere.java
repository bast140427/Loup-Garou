package Modele;

import Enumeration.CampEnum;

public class Sorciere extends Role{
    private boolean poison;
    private boolean soin;
    public Sorciere() {
        super(CampEnum.VILLAGEOIS);
        this.poison = true;
        this.soin = true;
    }

    public boolean isPoison() {
        return poison;
    }

    public boolean isSoin() {
        return soin;
    }

    public void empoisonner(Joueur j) {
        if(poison) {
            if(!j.isEnVie()) {
                System.out.println("Impossible d'empoisonner un joueur déjà éliminé");
            }else{
                j.setEnVie(false);
                poison = false;
            }
        }else{
            System.out.println("Potion de poison déjà utilisée");
        }

    }

    public void soigner(Joueur j) {
        if(soin) {
            if(j.isEnVie()) {
                System.out.println("Impossible de soigner un joueur déjà en vie");
            }else{
                j.setEnVie(true);
                soin = false;
            }
        }else{
            System.out.println("Potion de soin déjà utilisée");
        }

    }


}
