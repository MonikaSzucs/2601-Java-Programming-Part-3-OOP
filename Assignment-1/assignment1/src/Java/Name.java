import java.util.Locale;

class Name {
    private final String first;
    private final String last;

    Name(final String first, final String last) {
        if(first == null || first.isBlank()) {
            throw new IllegalArgumentException("The first name cannot be null or blank");
        }

        if(last == null || last.isBlank()) {
            throw new IllegalArgumentException("The last name cannot be null or blank");
        }

        this.first = first;
        this.last = last;
    }

    public String getFirst(final String first) {
        return first;
    }

    public String setLast(final String last) {
        return last;
    }

    public String getPrettyName() {
        return first.toUpperCase().charAt(0) + first.toLowerCase().substring(1) + " " + last.toUpperCase().charAt(0) + last.toLowerCase().substring(1);
    }

    public String getInitials() {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }
}
