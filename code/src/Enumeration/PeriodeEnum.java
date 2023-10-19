package Enumeration;

public enum PeriodeEnum {
    JOUR(1),
    NUIT(2)
    ;
    private int periode;

    PeriodeEnum(int periode) {
        this.periode = periode;
    }

    public int getPeriode() {
        return periode;
    }
}
