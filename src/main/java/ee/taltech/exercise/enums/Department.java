package ee.taltech.exercise.enums;

public enum Department {

    PEOPLE_MANAGEMENT("people management"),
    FINANCE("finance"),
    IT("IT"),
    ADMINISTRATION("administration"),
    SUPPORT("support");

    private final String value;

    Department(String v) {
        this.value = v;
    }

    public String getValue() {
        return value;
    }

    public static Department fromString(String v) {
        for (Department d : Department.values()) {
            if (d.getValue().equals(v)) {
                return d;
            }
        }
        return null;
    }
}
