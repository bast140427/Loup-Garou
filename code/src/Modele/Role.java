package Modele;

import Enumeration.CampEnum;

public class Role {
    protected CampEnum camp;

    public Role(CampEnum camp) {
        this.camp = camp;
    }

    public CampEnum getCamp() {
        return camp;
    }

    public void setCamp(CampEnum camp) {
        this.camp = camp;
    }
}
