public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedA = (Archive) compared;
        return this.identifier.equals(comparedA.identifier);
    }

    public String toString() {
        return identifier + ": " + name;
    }
}
