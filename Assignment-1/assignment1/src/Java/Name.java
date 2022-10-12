import java.util.Locale;

class Name {
    private final String first;
    private final String last;

    Name(final String first, final String last) {
        if(first == null || first.isBlank()) {
            throw new IllegalArgumentException("invalid first name");
        }

        if(last == null || last.isBlank()) {
            throw new IllegalArgumentException("invalid last name");
        }

        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPrettyName() {
        return first.toUpperCase().charAt(0) + first.toLowerCase().substring(1) + " " + last.toUpperCase().charAt(0) + last.toLowerCase().substring(1);
    }

    public String getInitials() {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }
}
