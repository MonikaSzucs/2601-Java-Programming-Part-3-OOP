import java.util.Comparator;

class Person implements Comparable {
    Date born;
    private Date died;
    Name name;

    Person(final Date born, final Name name) throws IllegalPersonException {
        if(born == null) {
            throw new IllegalPersonException("The date cannot be null");
        }
        if(name == null) {
            throw new IllegalPersonException("The name cannot be null");
        }
        this.born = born;
        this.name = name;

    }

    public void die(final Date dateOfDeath) {


    }

    public void getDateOfBirth() {
        System.out.println(born.getYyyyMmDd());
    }

    public void getDateOfDeath() {
        System.out.println(born.getYyyyMmDd());
    }


    public boolean isAlive() {
        return false;
    }

    public int compareTo(final Person p) {
        return 3;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    public String toString(){
//        do later
//    }


}
