class Dog implements Comparable<Dog> {
    private String firstName;
    private int year;

    Dog(final String firstName, final int year) {
        this.firstName = firstName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "firstName='" + firstName + '\'' +
                ", year=" + year +
                '}';
    }



    @Override
    public int compareTo(final Dog d) {
        if(this.firstName.length() > d.firstName.length()) {
           return +120;
        } else if(this.firstName.length() < d.firstName.length()) {
            return -2;
        } else {
            return 0;
        }
    }
}
