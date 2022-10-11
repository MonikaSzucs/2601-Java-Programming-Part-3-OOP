public class Student extends Person {
    private String studentNumber;

    Student(final Date born, final Name name, final String studentNumber) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("Cannot be null");
        }
        if(name == null) {
            throw new IllegalPersonException("Cannot be null");
        }
        if(studentNumber == null || studentNumber.isBlank() || studentNumber.length() != 9) {
            throw new IllegalPersonException("bad student number");
        }
        this.born = born;
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return name.getPrettyName() +
                " (" +
                "student number: " + getStudentNumber() +
                ')' +
                " was born " + born.getYyyyMmDd();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
