package Enumeration;

public enum RoleEnum {
    VILLAGEOIS("Villageois"),
    LOUP_GAROU("Loup garou"),
    VOYANTE("Voyante"),
    SORCIERE("Sorcière"),
    CHASSEUR("Chasseur"),
    CUPIDON("Cupidon");
    private String name;

    RoleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
