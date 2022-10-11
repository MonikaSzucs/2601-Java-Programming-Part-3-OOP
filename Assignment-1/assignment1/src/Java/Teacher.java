public class Teacher extends Person {
    private String specialty;

    Teacher(final Date born, final Name name, final String specialty) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("wrong date");
        }
        if(name == null) {
            throw new IllegalPersonException("wrong name");
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
        return  name.getPrettyName() +
                "(" +
                "specialty: " + getSpecialty() +
                ')' + born.getYyyyMmDd();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
