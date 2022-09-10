package ca.bcit.comp2601.lesson1.monikaszucs;

class BcitStudent extends Person {
    private final String studentNumber;

    /**
     * @param lastName  the last name of the person
     */
    BcitStudent(final String lastName, final String studentId) {
        super(lastName);
        studentNumber = studentId;
    }


    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    String getDetails() {
        return "I am a " + this.getClass().getSimpleName() +
                " and my last name is " + getLastName() +
                " and my student ID is " + getStudentNumber();
    }
}
