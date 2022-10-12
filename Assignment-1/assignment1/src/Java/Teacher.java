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


    public String toString() {
        //"Tiger Woods (specialty: mathematics) was born 1975-12-30 and is still alive"
        String returnString =  name.getPrettyName() +
                " (" +
                "specialty: " + getSpecialty() +
                ')' +
                " was born " + born.getYyyyMmDd();
        if(this.isAlive()){
            returnString += " and is still alive";
        }
        else{
            returnString += " and died ";
            returnString += died.getYyyyMmDd();
        }
        return returnString;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
