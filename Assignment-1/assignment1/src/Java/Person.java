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
        died = dateOfDeath;
//        System.out.println(died.getYear() + "-" + died.getMonth() + "-" + died.getDay());
    }

    public Date getDateOfBirth() {
        return new Date(born.getDay(), born.getMonth(), born.getYear());
    }

    public Date getDateOfDeath() {
        Date newDate;
        if(died != null) {
            newDate = new Date( died.getDay(), died.getMonth(),died.getYear());
        } else {
            newDate = new Date(1, 1, 1);
        }

        return newDate;
    }


    public boolean isAlive() {
        return died == null;
    }

    public int compareTo(final Person p) {
        return this.getDateOfBirth().compareTo(p.getDateOfBirth());
    }

    @Override
    public int compareTo(Object o) {
        if(o.getClass() != Person.class){
            throw new IllegalArgumentException("Comparing Person object to an object of a different class.");
        }
        Person p = (Person) o;
        return compareTo(p);
    }

    @Override
    public String toString() {
        //Albert Einstein (A.E.) was born on Friday 1879-03-14 and died on Monday 1955-04-18.System.lineSeparator()
        String returnValue = name.getPrettyName();
        returnValue+=" was born"+ " "+born.getYyyyMmDd();
        if(!isAlive()){
            returnValue+=" and died on " + died.getYyyyMmDd();
        }
        else{
            returnValue+=" and is still alive";
        }
        return returnValue;
    }
}
