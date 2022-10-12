public class Student extends Person {
    private String studentNumber;

    Student(final Date born, final Name name, final String studentNumber) throws IllegalPersonException {
        super(born, name);
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
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


    public String toString() {
        //"Tiger Woods (student number: A12345678) was born 1975-12-30 and is still alive"
        String returnString =  name.getPrettyName() +
                " (" +
                "student number: " + getStudentNumber() +
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
