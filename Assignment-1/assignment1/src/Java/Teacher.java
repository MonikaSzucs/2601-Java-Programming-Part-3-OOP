public class Teacher extends Person {
    private String specialty;

    Teacher(final Date born, final Name name, final String specialty) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
        }
        if(specialty.isBlank()) {
            throw new IllegalPersonException("bad specialty");
        }
        this.born = born;
        this.name = name;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        //"Tiger Woods (specialty: mathematics) was born 1975-12-30 and is still alive"
        return  name.getPrettyName() +
                " (" +
                "specialty: " + getSpecialty() +
                ") " + born.getYyyyMmDd() + " and " + getDateOfDeath().getYyyyMmDd();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
