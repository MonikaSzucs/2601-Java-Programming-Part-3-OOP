public class Main {

    public static void main(final String[] args) {
        Speakable s1;
        Person personOne;
        personOne = new Person("monika", "szucs");
        System.out.println(personOne.toString());
        s1 = new Person("joe", "bill");
        s1.speak();

        Speakable s;
        s = new Child("christian", "har");
        s.speak();


    }
}
