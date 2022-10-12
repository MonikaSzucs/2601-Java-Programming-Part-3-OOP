import java.util.Comparator;

class Person implements Comparable {
    Date born;
    Date died;
    Name name;

    Person(final Date born, final Name name) throws IllegalPersonException {
        if(born == null) {
            throw new IllegalPersonException("invalid date of birth");
        }
        if(name == null) {
            throw new IllegalPersonException("invalid name");
        }
        this.born = born;
        this.name = name;

    }

    public void die(final Date dateOfDeath) {
        if(dateOfDeath == null) {
            System.out.println("is still alive");
        }
        System.out.println(dateOfDeath.getYear() + "-" + dateOfDeath.getMonth() + "-" + dateOfDeath.getDay());

    }

    public Date getDateOfBirth() {
        return new Date(born.getYear(), born.getMonth(), born.getDay());
    }

    public Date getDateOfDeath() {
        Date newDate;
        if(died != null) {
            newDate = new Date(died.getYear(), died.getMonth(), died.getDay());
        } else {
            newDate = new Date(1, 1, 1);
        }

        return newDate;
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
}
