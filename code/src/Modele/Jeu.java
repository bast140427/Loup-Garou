package Modele;

import Enumeration.CampEnum;
import Enumeration.PeriodeEnum;

import java.util.ArrayList;

public class Jeu {
    private PeriodeEnum periode;
    private ArrayList<Joueur> joueurs = new ArrayList<>();
    private ArrayList<Joueur> villageois = new ArrayList<>();
    private ArrayList<Joueur> loupGarous = new ArrayList<>();
    private int joueurMax;

    public Jeu(ArrayList<Joueur> joueurs, int joueurMax) {
        this.joueurs = joueurs;
        this.joueurMax = joueurMax;
        this.periode = PeriodeEnum.JOUR;
    }

    public PeriodeEnum getPeriode() {
        return periode;
    }

    public void setPeriode(PeriodeEnum periode) {
        this.periode = periode;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public int getJoueurMax() {
        return joueurMax;
    }

    public int getJoueurRestant() {
        return joueurMax - joueurs.size();
    }

    public void setJoueurMax(int joueurMax) {
        this.joueurMax = joueurMax;
    }

    public void changerPeriode() {
        if(this.periode.equals(PeriodeEnum.JOUR)) {
            this.setPeriode(PeriodeEnum.NUIT);
        }else{
            this.setPeriode(PeriodeEnum.JOUR);
        }
    }

    public ArrayList<Joueur> getVillageois() {
        for(Joueur j : joueurs) {
            if(j.getRole().getCamp().equals(CampEnum.VILLAGEOIS)) {
                villageois.add(j);
            }
        }
        return villageois;
    }

    public ArrayList<Joueur> getLoupGarous() {
        for(Joueur j : joueurs) {
            if(j.getRole().getCamp().equals(CampEnum.LOUP_GAROUS)) {
                loupGarous.add(j);
            }
        }
        return loupGarous;
    }

    public CampEnum getGagnant() {
        if(this.villageois.isEmpty() || this.villageois.size() == this.loupGarous.size()) {
            return CampEnum.LOUP_GAROUS;
        }else if(this.loupGarous.isEmpty()){
            return CampEnum.VILLAGEOIS;
        }else {
            return null;
        }
    }
}
