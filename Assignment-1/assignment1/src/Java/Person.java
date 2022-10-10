import java.util.Comparator;

abstract class Person implements Comparable {
    private Date born;
    private Date died;
    private Name name;

    Person(final Date born, final Name name) {
        if(born == null) {
            throw new IllegalArgumentException("The date cannot be null");
        }
        if(name == null) {
            throw new IllegalArgumentException("The name cannot be null");
        }
        this.born = born;
        this.name = name;

    }

    public void die(final Date dateOfDeath) {

    }

    public boolean isAlive() {
        return false;
    }

    public int compareTo(final Person p) {

    }

//    public String toString(){
//        do later
//    }


}
